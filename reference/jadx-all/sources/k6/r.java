package k6;

import android.accounts.AccountManager;
import c3.C0063;
import c7.C0068;
import com.auto.accept.ui.viewmodel.C0073;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0129;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.remoteconfig.internal.Code;
import d1.C0212;
import d9.C0227;
import dagger.hilt.internal.definecomponent.C0250;
import f4.C0275;
import h5.C0307;
import h7.C0313;
import h8.C0315;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m3.C0353;
import n7.C0365;
import p7.C0379;
import s7.C0415;
import v.C0440;
import x7.C0473;

/* JADX INFO: loaded from: classes.dex */
public final class r extends o5 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f579short = {1367};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AccountManager f10333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f10334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10335g;

    /* JADX INFO: renamed from: ۟ۦۡۦۣ, reason: not valid java name and contains not printable characters */
    public static short[] m6590() {
        int iM4046 = C0212.m4046();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4046 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f579short;
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

    @Override // k6.o5
    public final boolean o() {
        Calendar calendarM8573 = null;
        TimeUnit timeUnitM4366 = null;
        int iM6903 = 0;
        int iM6904 = 0;
        int i10 = 0;
        long j10 = 0;
        TimeUnit timeUnitM9196 = null;
        long jM1209 = 0;
        Locale localeM1317 = null;
        String strM5926 = null;
        Locale localeM6082 = null;
        String strM7143 = null;
        String strM7144 = null;
        short[] sArrM6590 = null;
        String strM2490 = null;
        String str = "ۨۤۥ";
        while (true) {
            switch (C0124.m2383(str)) {
                case 56388:
                    localeM1317 = C0068.m1317();
                    str = "ۤۢ";
                    break;
                case 56390:
                    strM7143 = C0365.m7143(strM5926, localeM6082);
                    str = "ۨۧۥ";
                    break;
                case 56416:
                    iM6904 = C0415.f685;
                    str = "۠ۦۤ";
                    break;
                case 56446:
                    strM5926 = C0307.m5926(localeM1317);
                    str = "ۢ۠ۥ";
                    break;
                case 56539:
                    j10 = iM6904;
                    str = "ۥۢۢ";
                    break;
                case 1747742:
                    strM7144 = C0365.m7143(strM5926, localeM6082);
                    str = "ۣۧۤ";
                    break;
                case 1747842:
                    strM5926 = C0313.m6034(sArrM6590, 0, 1, 1402);
                    str = "ۡۦ۟";
                    break;
                case 1747870:
                    i10 = iM6904 ^ (-391);
                    str = "ۡۨۢ";
                    break;
                case 1748891:
                    iM6904 = C0353.m6903(calendarM8573, i10);
                    str = "ۣۧۢ";
                    break;
                case 1749604:
                    iM6904 = iM6903 - i10;
                    str = "ۧۢ";
                    break;
                case 1749607:
                    localeM6082 = C0315.m6082();
                    str = "ۢۨ";
                    break;
                case 1749608:
                    jM1209 = C0063.m1209(timeUnitM4366, j10, timeUnitM9196);
                    str = "ۥۣ۠";
                    break;
                case 1749729:
                    return false;
                case 1750784:
                    sArrM6590 = m6590();
                    str = "۠ۥۧ";
                    break;
                case 1752484:
                    timeUnitM4366 = C0227.m4366();
                    str = "ۥۢ۠";
                    break;
                case 1752488:
                    this.f10331c = jM1209;
                    str = "ۢۦ";
                    break;
                case 1752547:
                    iM6903 = C0073.f107;
                    str = "ۧۦۦ";
                    break;
                case 1752549:
                    timeUnitM9196 = C0473.m9196();
                    str = "ۢ۠ۦ";
                    break;
                case 1753634:
                    iM6903 = C0353.m6903(calendarM8573, iM6904);
                    str = "ۣۣ";
                    break;
                case 1754406:
                    this.f10332d = strM2490;
                    str = "ۣۢۤ";
                    break;
                case 1754472:
                    i10 = 0 - iM6904;
                    str = "ۢ۠ۢ";
                    break;
                case 1754599:
                    iM6904 = iM6903 ^ (-926);
                    str = "ۦۦۢ";
                    break;
                case 1755497:
                    calendarM8573 = C0440.m8573();
                    str = "ۥ۠۟";
                    break;
                case 1755590:
                    strM5926 = C0275.m5292(localeM1317);
                    str = "۠ۢ۠";
                    break;
                default:
                    strM2490 = C0129.m2490(strM7143, strM5926, strM7144);
                    str = "ۧ۠۟";
                    break;
            }
        }
    }

    public final long p() {
        C0167.m3203(this);
        return C0250.m4778(this);
    }

    public final String q() {
        C0167.m3203(this);
        return C0379.m7406(this);
    }
}
