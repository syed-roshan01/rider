package k6;

import a8.C0009;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.C0023;
import androidx.compose.ui.layout.C0035;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.firebase.C0205;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0203;
import e2.C0263;
import f.C0270;
import g7.C0292;
import o4.C0369;
import o8.C0371;
import r6.C0402;
import r7.C0404;
import s0.C0410;
import x4.C0468;
import x7.C0472;

/* JADX INFO: loaded from: classes.dex */
public final class w5 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f597short = {575, 570, 559, 570, 536, 564, 567, 567, 574, 568, 559, 562, 564, 565, 543, 574, 573, 570, 558, 567, 559, 542, 565, 570, 569, 567, 574, 575};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f10460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzdd f10462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f10464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10465j;

    public w5(Context context, zzdd zzddVar, Long l10) {
        this.f10463h = true;
        C0270.m5173(context);
        Context contextM447 = C0023.m447(context);
        C0270.m5173(contextM447);
        this.f10456a = contextM447;
        this.f10464i = l10;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zzddVar != null ? 1709 : 1678;
                    break;
                case 204:
                    this.f10462g = zzddVar;
                    this.f10457b = C0369.m7262(zzddVar);
                    this.f10458c = C0402.m7902(zzddVar);
                    this.f10459d = C0263.m5032(zzddVar);
                    this.f10463h = C0468.m9130(zzddVar);
                    this.f10461f = C0410.m8062(zzddVar);
                    this.f10465j = C0371.m7284(zzddVar);
                    Bundle bundleM3699 = C0193.m3699(zzddVar);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = bundleM3699 != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                this.f10460e = C0009.m192(C0404.m7928(bundleM3699, C0035.m686(m6607(), 0, C0292.f440 ^ 51, 603), true));
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
        int iM3894 = C0203.m3894();
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (iM3894 <= 0) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    return;
                case 47417:
                    System.out.println(Float.decode(C0472.m9195("bS")));
                    return;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
    }

    /* JADX INFO: renamed from: ۟ۡۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6607() {
        int iM3914 = C0205.m3914();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3914 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f597short;
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
}
