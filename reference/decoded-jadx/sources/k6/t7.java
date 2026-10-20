package k6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.semantics.C0039;
import androidx.preference.C0044;
import androidx.profileinstaller.C0046;
import androidx.versionedparcelable.C0048;
import c4.C0066;
import com.google.android.gms.common.C0087;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.abt.C0112;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.firestore.auth.C0146;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import com.google.gson.internal.sql.C0208;
import d4.C0217;
import dagger.hilt.android.components.C0229;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.components.C0244;
import dagger.hilt.internal.definecomponent.C0249;
import fa.C0281;
import i5.C0318;
import i6.C0320;
import j2.C0323;
import j9.C0329;
import k2.C0333;
import n1.C0362;
import p5.C0377;
import q7.C0390;
import r2.C0396;
import r5.C0399;
import r6.C0401;
import t2.C0422;
import u.C0429;
import v0.C0443;
import v7.C0448;
import v8.C0450;
import x8.C0473;
import z3.C0487;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends a6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f10406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10408f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f10409n;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f589short = {1696, 1670, 1680, 1671, 1749, 1684, 1665, 1665, 1671, 1692, 1687, 1664, 1665, 1680, 1749, 1682, 1692, 1667, 1680, 1691, 1749, 1690, 1683, 1749, 1664, 1691, 1752, 1670, 1664, 1669, 1669, 1690, 1671, 1665, 1680, 1681, 1749, 1665, 1676, 1669, 1680};
    public static final Parcelable.Creator<t7> CREATOR = new z5.n(C0217.f241 ^ 984);

    public t7(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        Double dM8281;
        this.f10403a = i10;
        this.f10404b = str;
        this.f10405c = j10;
        this.f10406d = l10;
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i11 = i10 == 1 ? 1709 : 1678;
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i12 = f10 != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                dM8281 = null;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                dM8281 = C0422.m8281(C0362.m7107(f10));
                                int i13 = 1864;
                                while (true) {
                                    i13 ^= 1881;
                                    switch (i13) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i13 = 48674;
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
                    this.f10409n = dM8281;
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case Code.UNAVAILABLE /* 14 */:
                                break;
                            case 239:
                                i14 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    this.f10409n = d10;
                    break;
                default:
                    break;
            }
        }
        this.f10407e = str2;
        this.f10408f = str3;
        int iM4779 = C0249.m4779();
        int i15 = 48891;
        while (true) {
            i15 ^= 48908;
            switch (i15) {
                case 22:
                    break;
                case 53:
                    return;
                case 503:
                    if (iM4779 >= 0) {
                        i15 = 49635;
                    }
                    break;
                case 32495:
                    System.out.println(Long.valueOf(C0039.m775("ZAkeYcKNMWQRbDCJyW7l")));
                    return;
                default:
                    continue;
            }
            i15 = 48953;
        }
    }

    public t7(String str, String str2, long j10, Object obj) {
        C0281.m5438(str);
        this.f10403a = 2;
        this.f10404b = str;
        this.f10405c = j10;
        this.f10408f = str2;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (obj == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    this.f10406d = null;
                    this.f10409n = null;
                    this.f10407e = null;
                    int iM9210 = C0473.m9210();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (iM9210 >= 0) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                System.out.println(Float.valueOf(C0196.m3758("lg7AfVzz1vQe1B3k2c")));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    boolean z10 = obj instanceof Long;
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (z10) {
                                    i12 = 48736;
                                }
                                break;
                            case 47384:
                                boolean z11 = obj instanceof String;
                                int i13 = 48767;
                                while (true) {
                                    i13 ^= 48784;
                                    switch (i13) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            boolean z12 = obj instanceof Double;
                                            int i14 = 48891;
                                            while (true) {
                                                i14 ^= 48908;
                                                switch (i14) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        throw new IllegalArgumentException(C0188.m3587(m6599(), 0, C0377.f648 ^ 150, 1781));
                                                    case 503:
                                                        if (z12) {
                                                            i14 = 49635;
                                                        }
                                                        break;
                                                    case 32495:
                                                        this.f10406d = null;
                                                        this.f10409n = (Double) obj;
                                                        this.f10407e = null;
                                                        return;
                                                    default:
                                                        break;
                                                }
                                                i14 = 48953;
                                            }
                                            break;
                                        case 76:
                                            this.f10406d = null;
                                            this.f10409n = null;
                                            this.f10407e = (String) obj;
                                            return;
                                        case 239:
                                            if (z11) {
                                                i13 = 48860;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i13 = 48829;
                                }
                                break;
                            case 47417:
                                this.f10406d = (Long) obj;
                                this.f10409n = null;
                                this.f10407e = null;
                                return;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i12 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public t7(v7 v7Var) {
        this(C0320.m6207(v7Var), C0233.m4504(v7Var), C0046.m896(v7Var), C0146.m2777(v7Var));
        int iM1277 = C0066.m1277();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1277 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0281.m5439("DaHZp")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۦۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6599() {
        int iM3984 = C0208.m3984();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3984 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f589short;
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

    public final Object e() {
        Long lM8744 = C0448.m8744(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (lM8744 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return lM8744;
                case 239:
                    Double dM9489 = C0487.m9489(this);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (dM9489 != null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                String strM6469 = C0333.m6469(this);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (strM6469 != null) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return null;
                                        case 47417:
                                            return strM6469;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                return dM9489;
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM1863 = C0087.m1863(C0329.f477 ^ 19458, parcel);
        int i11 = C0401.f672 ^ (-521);
        C0229.m4414(parcel, 1, i11);
        C0103.m2015(parcel, C0490.m9541(this));
        C0048.m942(parcel, C0323.f471 ^ (-984), C0450.m8772(this));
        int i12 = C0116.f142;
        int i13 = C0333.f517 ^ 770;
        C0229.m4414(parcel, i12 ^ 239, i13);
        C0044.m853(parcel, C0429.m8421(this));
        C0333.m6474(parcel, i11, C0448.m8744(this));
        C0048.m942(parcel, C0390.f661 ^ (-317), C0333.m6469(this));
        C0048.m942(parcel, C0027.f47 ^ 810, C0443.m8652(this));
        Double dM9489 = C0487.m9489(this);
        int i14 = 1616;
        while (true) {
            i14 ^= 1633;
            switch (i14) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i14 = dM9489 == null ? 1709 : 1678;
                    break;
                case 204:
                    int i15 = 1740;
                    while (true) {
                        i15 ^= 1757;
                        switch (i15) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i15 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    C0229.m4414(parcel, i13, i13);
                    C0396.m7753(parcel, C0112.m2157(dM9489));
                    break;
                default:
                    break;
            }
        }
        C0318.m6160(iM1863, parcel);
        int iM4685 = C0244.m4685();
        int i16 = 1864;
        while (true) {
            i16 ^= 1881;
            switch (i16) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM4685 <= 0) {
                        i16 = 48736;
                    }
                    break;
                case 47384:
                    return;
                case 47417:
                    System.out.println(Integer.valueOf(C0399.m7815("VBIEwwiFh4xE680WMzbtzn")));
                    return;
                case 47483:
                    break;
                default:
                    continue;
            }
            i16 = 48705;
        }
    }
}
