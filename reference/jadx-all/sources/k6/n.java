package k6;

import android.os.C0013;
import android.os.Handler;
import android.support.v4.app.C0014;
import android.support.v4.graphics.drawable.C0016;
import androidx.preference.C0044;
import androidx.startup.C0047;
import c4.C0065;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.firebase.annotations.concurrent.C0123;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.appcheck.interop.C0130;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.C0200;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.ktx.C0199;
import f.C0271;
import f4.C0276;
import h1.C0301;
import h3.C0302;
import k4.C0337;
import m1.C0352;
import r6.C0402;
import t1.C0420;
import u8.C0439;
import w0.C0455;
import w5.C0464;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile zzcp f10213d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f566short = {1921, 1958, 1966, 1963, 1954, 1955, 2023, 1971, 1960, 2023, 1972, 1956, 1967, 1954, 1955, 1970, 1963, 1954, 2023, 1955, 1954, 1963, 1958, 1982, 1954, 1955, 2023, 1975, 1960, 1972, 1971, 2025, 2023, 1971, 1966, 1962, 1954};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p5 f10214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l.h f10215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f10216c;

    public n(p5 p5Var) {
        C0271.m5173(p5Var);
        this.f10214a = p5Var;
        this.f10215b = new l.h(C0199.f223 ^ (-53), this, p5Var);
        int iM860 = C0044.m860();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM860 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.valueOf(C0013.m254("Y3Mb")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۧۧۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6578() {
        int iM3841 = C0200.m3841();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3841 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f566short;
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

    public final void a() {
        String str = "ۦۡ";
        Handler handlerM2369 = null;
        l.h hVarM5302 = null;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56507:
                    this.f10216c = 0L;
                    str = "ۥۦۡ";
                    break;
                case 1750720:
                    str = "ۦۡۧ";
                    hVarM5302 = C0276.m5302(this);
                    break;
                case 1750721:
                    return;
                case 1752672:
                    handlerM2369 = C0123.m2369(this);
                    str = "ۣۥۢ";
                    break;
                default:
                    C0065.m1263(handlerM2369, hVarM5302);
                    str = "ۣۥۣ";
                    break;
            }
        }
    }

    public final void b(long j10) {
        C0164.m3150(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (j10 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0014.m280((e6.c) C0464.m9023(C0047.m908(this)));
                    this.f10216c = C0402.m7869();
                    boolean zM6531 = C0337.m6531(C0123.m2369(this), C0276.m5302(this), j10);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (!zM6531) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0420.m8245(C0455.m8871(C0301.m5782(C0047.m908(this))), C0302.m5796(m6578(), 0, C0130.f156 ^ (-30), 1991), C0439.m8554(j10));
                                return;
                            default:
                                continue;
                        }
                        i11 = 1802;
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

    public abstract void c();

    public final Handler d() {
        zzcp zzcpVarM1739;
        zzcp zzcpVarM17310 = C0081.m1739();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zzcpVarM17310 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return C0081.m1739();
                case 239:
                    synchronized (n.class) {
                        try {
                            zzcp zzcpVarM17311 = C0081.m1739();
                            int i11 = 1740;
                            while (true) {
                                i11 ^= 1757;
                                switch (i11) {
                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i11 = zzcpVarM17311 == null ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                        f10213d = new zzcp(C0016.m317(C0352.m6899(C0047.m908(this))));
                                        int i12 = 1864;
                                        while (true) {
                                            i12 ^= 1881;
                                            switch (i12) {
                                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                    i12 = 48674;
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
                            zzcpVarM1739 = C0081.m1739();
                            break;
                        } catch (Throwable th) {
                            int i13 = 48767;
                            while (true) {
                                i13 ^= 48784;
                                switch (i13) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        throw th;
                                    case 239:
                                        i13 = 48798;
                                        break;
                                }
                            }
                        }
                    }
                    return zzcpVarM1739;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
