package a5;

import android.os.C0013;
import androidx.compose.ui.input.pointer.C0034;
import androidx.profileinstaller.C0046;
import c1.C0058;
import com.google.firebase.abt.C0113;
import com.google.firebase.remoteconfig.internal.Code;
import d7.C0220;
import e2.C0261;
import e9.C0267;
import k3.C0336;
import o7.i2;
import p7.C0379;
import s3.C0413;
import u4.C0436;
import v9.C0453;
import x5.C0471;
import z7.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1221a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f8short = {1844, 1845, 1843, 1855, 1844, 1845, 1912, 1918, 1918, 1918, 1913, 3087, 3110, 3132, 3166, 3085, 3110, 3107, 3160, 3106, 3095, 3159, 3092, 3124, 3129, 3104, 3167, 3085, 3075, 3128, 3072, 3082, 3095, 3163, 3097, 3127, 3126, 3074, 3166, 3084, 3133, 3163, 3102, 3084, 3079, 3159, 3096, 3085, 3075, 3132, 3074, 3085, 3079, 3159, 3092, 3082, 3113, 3112, 3166, 3082, 3126, 3107, 3155, 422, 410, 429, 411, 417, 447, 417, 440, 442, 413, 422, 453, 441, 413, 412, 452, 440, 435, 438, 454, 442, 419, 442, 397, 442, 397, 400, 458};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f1219b = new a0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f1220c = new a0(1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10) {
        super(0);
        this.f1221a = i10;
        int iM9151 = C0471.m9151();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9151 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0413.m8105("Wc5QHEw3ClHFdJ")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۢ, reason: not valid java name and contains not printable characters */
    public static short[] m124() {
        int iM7420 = C0379.m7420();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7420 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f8short;
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

    public final String a() {
        int iM4965 = C0261.m4965(this);
        String strM8505 = C0436.m8505(m124(), 0, C0113.f139 ^ (-85), 1872);
        switch (iM4965) {
            case 0:
                C0034.m673();
                byte[] bArrM9553 = C0491.m9553(C0267.m5096(m124(), 63, C0046.f66 ^ (-802), 503), 0);
                C0336.m6501(bArrM9553, strM8505);
                return new String(bArrM9553, C0453.m8816());
            default:
                C0034.m673();
                byte[] bArrM9554 = C0491.m9553(C0220.m4233(m124(), 11, C0058.f78 ^ (-528), 3182), 0);
                C0336.m6501(bArrM9554, strM8505);
                return new String(bArrM9554, C0453.m8816());
        }
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (C0261.m4965(this)) {
            case 0:
                break;
        }
        return C0013.m255(this);
    }
}
