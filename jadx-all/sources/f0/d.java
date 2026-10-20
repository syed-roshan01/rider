package f0;

import a8.C0009;
import aa.C0012;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import androidx.compose.foundation.text.modifiers.C0025;
import androidx.compose.ui.layout.C0035;
import com.google.android.gms.common.api.internal.C0082;
import com.google.android.gms.common.util.C0086;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.appcheck.C0131;
import com.google.firebase.firestore.index.C0154;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d9.C0227;
import dagger.hilt.android.C0241;
import e2.C0264;
import h.C0299;
import java.util.Map;
import k3.C0336;
import l6.C0344;
import n.C0361;
import n9.C0367;
import o7.i2;
import p3.C0376;
import s0.C0411;
import u1.C0433;
import w.C0454;
import w0.C0455;
import x4.C0470;
import z8.C0492;
import z8.C0493;

/* JADX INFO: loaded from: classes.dex */
public final class d extends d9.j implements c9.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f354short = {1664, 1693, 521, 594, 592, 577, 536, 579, 596, 601, 576, 592, 523, 541, 539, 539, 539, 540};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(long j10, int i10) {
        super(1);
        this.f5658a = i10;
        this.f5659b = j10;
        int iM3855 = C0201.m3855();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3855 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0454.m8847("FBBq0tf68VqNL06exHsIIjSxh8u"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤۡ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m5182() {
        int iM1758 = C0082.m1758();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM1758 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f354short;
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

    @Override // c9.c
    public final Object invoke(Object obj) {
        ColorFilter porterDuffColorFilter;
        boolean z10 = true;
        int iM7064 = C0361.m7064(this);
        long jM9138 = C0470.m9138(this);
        switch (iM7064) {
            case 0:
                b1.d dVar = (b1.d) obj;
                float fM6741 = C0344.m6741(C0433.m8454(C0227.m4369(dVar))) / 2.0f;
                e1.y yVarM5029 = C0264.m5029(dVar, fM6741);
                int iM7181 = C0367.m7181();
                int i10 = C0455.f725 ^ 305;
                int i11 = 1864;
                while (true) {
                    i11 ^= 1881;
                    switch (i11) {
                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM7181 >= 29) {
                                i11 = 48736;
                            }
                            break;
                        case 47384:
                            porterDuffColorFilter = new PorterDuffColorFilter(C0299.m5743(jM9138), C0025.m498(i10));
                            break;
                        case 47417:
                            porterDuffColorFilter = C0185.m3535(C0116.m2231(), jM9138, i10);
                            int i12 = 48767;
                            while (true) {
                                i12 ^= 48784;
                                switch (i12) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 239:
                                        i12 = 48798;
                                        break;
                                }
                            }
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i11 = 48705;
                }
                return C0035.m684(dVar, new u.o(fM6741, yVarM5029, new e1.l(jM9138, i10, porterDuffColorFilter)));
            case 1:
                C0493.m9574((y1.j) ((y1.v) obj), C0197.m3769(), new h0.c0(C0086.m1828(), C0470.m9138(this), C0411.f681 ^ 951, true));
                return C0012.m238();
            default:
                Map.Entry entry = (Map.Entry) obj;
                C0376.m7360(entry, C0131.m2529(m5182(), 0, C0173.f197 ^ (-814), 1769));
                Object objM4610 = C0241.m4610(entry);
                C0336.m6501(objM4610, C0154.m2951(m5182(), 2, C0492.f765 ^ (-849), 565));
                long jM3863 = C0201.m3863((Number) objM4610);
                int i13 = 1616;
                while (true) {
                    i13 ^= 1633;
                    switch (i13) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (((jM9138 + 3) - jM3863) - 3 > 300) {
                                i13 = 1709;
                            }
                            break;
                        case 204:
                            int i14 = 1740;
                            while (true) {
                                i14 ^= 1757;
                                switch (i14) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i14 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            z10 = false;
                            break;
                        default:
                            continue;
                    }
                    i13 = 1678;
                }
                return C0009.m192(z10);
        }
    }
}
