package a5;

import com.google.firebase.firestore.remote.C0163;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0223;
import f4.C0275;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import n7.C0365;
import o7.i2;
import q1.C0384;
import t3.C0425;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements HostnameVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f13short = {726, 711, 735, 722, 715, 648, 719, 712, 2855, 2870, 2862, 2851, 2874, 2937, 2868, 2872, 2874};

    /* JADX INFO: renamed from: ۣۨۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m129() {
        int iM7523 = C0384.m7523();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7523 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f13short;
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

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        C0189.m3608(str);
        boolean zM5284 = C0275.m5284(str, C0223.m4290(m129(), 0, C0365.f635 ^ (-750), 678), false);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = !zM5284 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM5285 = C0275.m5284(str, C0425.m8319(m129(), 8, C0163.f187 ^ (-691), 2903), false);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM5285 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                return false;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
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
        return true;
    }
}
