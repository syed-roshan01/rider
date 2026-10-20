package k6;

import android.os.Bundle;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.foundation.text.modifiers.C0025;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.ktx.C0180;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.android.components.C0230;
import dagger.hilt.migration.C0255;
import e1.C0258;
import h8.C0314;
import java.util.Map;
import k.C0332;
import l3.C0343;
import m0.C0350;
import t1.C0420;
import w0.C0455;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class q7 implements i4, w7 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f578short = {2536, 2521, 2521, 2528, 2509, 2441, 2503, 2502, 2525, 2441, 2498, 2503, 2502, 2526, 2503, 2441, 2526, 2497, 2508, 2503, 2441, 2501, 2502, 2510, 2510, 2496, 2503, 2510, 2441, 2508, 2527, 2508, 2503, 2525};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7 f10330a;

    public /* synthetic */ q7(p7 p7Var) {
        this.f10330a = p7Var;
        int iM495 = C0025.m495();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM495 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0130.m2509("UxUaeoTk6ks7XlVBYv3")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۥۧۨ۠, reason: contains not printable characters */
    public static short[] m6589() {
        int iM6408 = C0332.m6408();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6408 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f578short;
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

    @Override // k6.i4
    public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
        p7 p7VarM2631 = null;
        String str2 = "ۣ۟۟";
        while (true) {
            switch (C0124.m2383(str2)) {
                case 1746691:
                    p7VarM2631 = C0136.m2631(this);
                    str2 = "ۨۥۧ";
                    break;
                case 1752674:
                    return;
                default:
                    C0255.m4853(p7VarM2631, str, i10, th, bArr, map);
                    str2 = "ۥۦۣ";
                    break;
            }
        }
    }

    @Override // k6.w7
    public final void zza(String str, String str2, Bundle bundle) {
        boolean zM1883 = C0088.m1883(str);
        p7 p7VarM2631 = C0136.m2631(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM1883) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    f5 f5VarM6073 = C0314.m6073(p7VarM2631);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (f5VarM6073 != null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                d4 d4VarM3434 = C0180.m3434(f5VarM6073);
                                C0258.m4924(d4VarM3434);
                                C0420.m8245(C0455.m8871(d4VarM3434), C0021.m421(m6589(), 0, C0350.f620 ^ 779, 2473), str2);
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    break;
                case 239:
                    C0343.m6719(C0486.m9461(p7VarM2631), new k.e(this, str, str2, bundle, C0230.f309 ^ (-246)));
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
