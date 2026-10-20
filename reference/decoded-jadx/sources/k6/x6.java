package k6;

import android.os.RemoteException;
import androidx.compose.foundation.layout.C0021;
import androidx.compose.ui.draw.C0027;
import androidx.compose.ui.draw.C0029;
import com.auto.accept.data.model.C0071;
import com.google.android.gms.common.C0087;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.C0088;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.C0205;
import com.google.firebase.analytics.connector.C0117;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.C0128;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.messaging.ktx.C0186;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0225;
import dagger.hilt.android.lifecycle.C0237;
import ea.C0268;
import f.C0270;
import h7.C0310;
import java.util.concurrent.atomic.AtomicReference;
import k4.C0336;
import t2.C0423;
import u4.C0435;
import w0.C0454;
import w2.C0456;
import y6.C0476;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class x6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f601short = {2221, 2281, 2272, 2274, 2276, 2278, 2300, 2220, 2213, 2243, 2276, 2284, 2281, 2272, 2273, 2213, 2289, 2282, 2213, 2274, 2272, 2289, 2213, 2288, 2294, 2272, 2295, 2213, 2293, 2295, 2282, 2293, 2272, 2295, 2289, 2284, 2272, 2294, 2238, 2213, 2283, 2282, 2289, 2213, 2278, 2282, 2283, 2283, 2272, 2278, 2289, 2272, 2273, 2213, 2289, 2282, 2213, 2294, 2272, 2295, 2291, 2284, 2278, 2272, 1933, 1993, 1984, 1986, 1988, 1990, 2012, 1932, 1925, 2019, 1988, 1996, 1993, 1984, 1985, 1925, 2001, 1994, 1925, 1986, 1984, 2001, 1925, 2000, 2006, 1984, 2007, 1925, 2005, 2007, 1994, 2005, 1984, 2007, 2001, 1996, 1984, 2006, 1950, 1925, 2007, 1984, 1992, 1994, 2001, 1984, 1925, 1984, 2013, 1990, 1984, 2005, 2001, 1996, 1994, 1995};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f10536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10537b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x7 f10540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10541f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s6 f10542n;

    public x6(s6 s6Var, AtomicReference atomicReference, String str, String str2, x7 x7Var, boolean z10) {
        this.f10542n = s6Var;
        this.f10536a = atomicReference;
        this.f10538c = str;
        this.f10539d = str2;
        this.f10540e = x7Var;
        this.f10541f = z10;
        int iM8307 = C0423.m8307();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8307 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0481.m9376("HNdqq4fnAQ9DTbAPZtyjKaSFpSW")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6610() {
        int iM3548 = C0186.m3548();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3548 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f601short;
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

    @Override // java.lang.Runnable
    public final void run() {
        int iM2475;
        int i10;
        synchronized (C0205.m3911(this)) {
            try {
                try {
                    try {
                        s6 s6VarM1868 = C0087.m1868(this);
                        y3 y3VarM2387 = C0124.m2387(s6VarM1868);
                        int i11 = 1616;
                        while (true) {
                            i11 ^= 1633;
                            switch (i11) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 49:
                                    i11 = y3VarM2387 == null ? 1709 : 1678;
                                    break;
                                case 204:
                                    C0237.m4564(C0454.m8871(C0029.m572(s6VarM1868)), C0127.m2451(m6610(), 0, C0456.f727 ^ 642, 2181), C0027.m535(C0481.m9380(this)), C0268.m5117(this), C0476.m9286(this));
                                    C0225.m4329(C0205.m3911(this), C0160.m3062());
                                    C0123.m2376(C0205.m3911(this));
                                    return;
                                case 239:
                                    boolean zM1883 = C0088.m1883(C0481.m9380(this));
                                    int i12 = 48891;
                                    while (true) {
                                        i12 ^= 48908;
                                        switch (i12) {
                                            case 22:
                                                break;
                                            case 53:
                                                C0225.m4329(C0205.m3911(this), C0117.m2259(y3VarM2387, C0481.m9380(this), C0268.m5117(this), C0476.m9286(this), C0163.m3127(this)));
                                                break;
                                            case 503:
                                                i12 = zM1883 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                C0270.m5173(C0435.m8520(this));
                                                C0225.m4329(C0205.m3911(this), C0103.m2026(y3VarM2387, C0268.m5117(this), C0476.m9286(this), C0163.m3127(this), C0435.m8520(this)));
                                                int i13 = 49666;
                                                while (true) {
                                                    i13 ^= 49683;
                                                    switch (i13) {
                                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                            i13 = 49697;
                                                            continue;
                                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                                    C0310.m6011(C0087.m1868(this));
                                    C0123.m2376(C0205.m3911(this));
                                    int i14 = 49790;
                                    while (true) {
                                        i14 ^= 49807;
                                        switch (i14) {
                                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                break;
                                            case 241:
                                                i14 = 49821;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        while (true) {
                            i10 ^= 49931;
                            switch (i10) {
                                case 497:
                                    if (iM2475 >= 0) {
                                        i10 = 50658;
                                    }
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    return;
                                case 1769:
                                    System.out.println(Double.decode(C0071.m1457("w5lQfay1bwG")));
                                    return;
                                default:
                                    continue;
                            }
                            i10 = 50627;
                        }
                    } catch (Throwable th) {
                        int i15 = 1864;
                        while (true) {
                            i15 ^= 1881;
                            switch (i15) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i15 = 48674;
                                    break;
                                case 47483:
                                    C0123.m2376(C0205.m3911(this));
                                    throw th;
                            }
                        }
                    }
                } catch (RemoteException e4) {
                    int i16 = 48767;
                    while (true) {
                        i16 ^= 48784;
                        switch (i16) {
                            case Code.UNAVAILABLE /* 14 */:
                                C0237.m4564(C0454.m8871(C0029.m572(C0087.m1868(this))), C0021.m421(m6610(), 64, C0336.f520 ^ (-893), 1957), C0027.m535(C0481.m9380(this)), C0268.m5117(this), e4);
                                C0225.m4329(C0205.m3911(this), C0160.m3062());
                                C0123.m2376(C0205.m3911(this));
                                break;
                            case 239:
                                i16 = 48798;
                                continue;
                            default:
                                continue;
                        }
                    }
                }
                iM2475 = C0128.m2475();
                i10 = 49914;
            } catch (Throwable th2) {
                int i17 = 1740;
                while (true) {
                    i17 ^= 1757;
                    switch (i17) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i17 = 1771;
                            break;
                        case 54:
                            throw th2;
                    }
                }
            }
        }
    }
}
