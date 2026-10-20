package f0;

import a.C0000;
import android.support.v4.app.C0015;
import androidx.annotation.C0019;
import com.auto.accept.ui.viewmodel.C0075;
import com.google.android.gms.common.util.C0085;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.remote.C0165;
import com.google.firebase.installations.interop.C0174;
import com.google.firebase.measurement.C0181;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.codegen.C0243;
import h8.C0315;
import n7.C0364;
import o7.i2;
import q0.C0383;
import w2.C0459;
import x5.C0471;
import z.C0482;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f371short = {1470};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5840a = C0243.m4643(C0075.f109 ^ 267, C0189.m3620(m5198(), 0, 1, 1526));

    public static final long a(a2.c0 c0Var, m2.b bVar, f2.d dVar, String str, int i10) {
        r8.r rVarM7500 = null;
        int i11 = 0;
        long jM4 = 0;
        a2.a aVarM9163 = null;
        float fM6089 = 0.0f;
        String str2 = "ۡۦۢ";
        i2.d dVarM1821 = null;
        int iM380 = 0;
        int iM381 = i10;
        while (true) {
            switch (C0124.m2383(str2)) {
                case 1746693:
                    jM4 = C0000.m4(iM380, iM381);
                    str2 = "ۢۦۧ";
                    break;
                case 1747682:
                    i11 = iM380 ^ (-969);
                    str2 = "ۥۦۡ";
                    break;
                case 1747716:
                    i11 = iM380 ^ 296;
                    str2 = "ۦۡۨ";
                    break;
                case 1749795:
                    return jM4;
                case 1750689:
                    iM381 = C0019.m380(fM6089);
                    str2 = "۟۟ۥ";
                    break;
                case 1751555:
                    str2 = "۠۠ۢ";
                    iM380 = C0181.f205;
                    break;
                case 1752515:
                    str2 = "۠ۡۥ";
                    iM380 = C0165.f189;
                    break;
                case 1752580:
                    str2 = "ۥۦۥ";
                    iM380 = C0019.m380(fM6089);
                    break;
                case 1752672:
                    aVarM9163 = C0471.m9163(str, c0Var, jM4, bVar, dVar, rVarM7500, iM381, i11);
                    str2 = "ۣۣۧ";
                    break;
                case 1752676:
                    str2 = "ۣۤۢ";
                    fM6089 = C0315.m6089(aVarM9163);
                    break;
                case 1753417:
                    str2 = "ۥۣۢ";
                    fM6089 = C0482.m9370(dVarM1821);
                    break;
                case 1753485:
                    jM4 = C0174.m3315(0, 0, i11);
                    str2 = "ۤۡ۠";
                    break;
                case 1754503:
                    str2 = "ۦ۟ۢ";
                    dVarM1821 = C0085.m1821(aVarM9163);
                    break;
                default:
                    rVarM7500 = C0383.m7500();
                    str2 = "ۥۡ۟";
                    break;
            }
        }
    }

    public static /* synthetic */ long b(a2.c0 c0Var, m2.b bVar, f2.d dVar) {
        String strM289 = null;
        long jM8933 = 0;
        String str = "ۣۤۢ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56507:
                    jM8933 = C0459.m8933(c0Var, bVar, dVar, strM289, 1);
                    str = "ۡۥۧ";
                    break;
                case 1751589:
                    strM289 = C0015.m289();
                    str = "ۦۡ";
                    break;
                default:
                    return jM8933;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۥۢۨ, reason: contains not printable characters */
    public static short[] m5198() {
        int iM7127 = C0364.m7127();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7127 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f371short;
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
}
