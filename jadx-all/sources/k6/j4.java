package k6;

import a0.C0003;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.compose.ui.platform.C0038;
import c7.C0068;
import com.google.firebase.analytics.connector.internal.C0114;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import d.C0211;
import d4.C0218;
import dagger.hilt.internal.aliasof.C0248;
import dagger.hilt.migration.C0255;
import f4.C0277;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import n.C0361;
import q1.C0384;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends m7 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f553short = {882, 894, 895, 895, 884, 882, 869, 888, 871, 888, 869, 872};

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0016. Please report as an issue. */
    public static byte[] s(HttpURLConnection httpURLConnection) {
        InputStream inputStreamM59 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStreamM59 = C0003.m59(httpURLConnection);
            byte[] bArr = new byte[1024];
            while (true) {
                int iM4740 = C0248.m4740(inputStreamM59, bArr);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i10 = iM4740 > 0 ? 1709 : 1678;
                            break;
                        case 204:
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                    byte[] bArrM7522 = C0384.m7522(byteArrayOutputStream);
                    C0140.m2704(inputStreamM59);
                    return bArrM7522;
                }
                C0361.m7075(byteArrayOutputStream, bArr, 0, iM4740);
                int i11 = 1740;
                while (true) {
                    i11 ^= 1757;
                    switch (i11) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            i11 = 1771;
                            break;
                        case 54:
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            int i12 = 1864;
            while (true) {
                i12 ^= 1881;
                switch (i12) {
                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i12 = 48674;
                        break;
                    case 47483:
                        int i13 = 48767;
                        while (true) {
                            i13 ^= 48784;
                            switch (i13) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                    break;
                                case 76:
                                    C0140.m2704(inputStreamM59);
                                    break;
                                case 239:
                                    i13 = inputStreamM59 != null ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                        }
                        throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۦ۟۟, reason: contains not printable characters */
    public static short[] m6565() {
        int iM4866 = C0255.m4866();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4866 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f553short;
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

    @Override // k6.m7
    public final boolean r() {
        return false;
    }

    public final boolean t() {
        NetworkInfo networkInfoM4021;
        C0068.m1329(this);
        ConnectivityManager connectivityManager = (ConnectivityManager) C0218.m4133(C0277.m5311(this), C0248.m4739(m6565(), 0, C0114.f140 ^ (-300), 785));
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = connectivityManager != null ? 1709 : 1678;
                    break;
                case 204:
                    try {
                        networkInfoM4021 = C0211.m4021(connectivityManager);
                        break;
                    } catch (SecurityException e4) {
                        int i11 = 48767;
                        while (true) {
                            i11 ^= 48784;
                            switch (i11) {
                                case Code.UNAVAILABLE /* 14 */:
                                    networkInfoM4021 = null;
                                    break;
                                case 239:
                                    i11 = 48798;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    }
                    break;
                case 239:
                    networkInfoM4021 = null;
                    break;
                default:
                    break;
            }
        }
        int i12 = 1740;
        while (true) {
            i12 ^= 1757;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (networkInfoM4021 != null) {
                        i12 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    break;
                case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                    boolean zM755 = C0038.m755(networkInfoM4021);
                    int i13 = 1864;
                    while (true) {
                        i13 ^= 1881;
                        switch (i13) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (zM755) {
                                    i13 = 48736;
                                }
                                break;
                            case 47384:
                                break;
                            case 47417:
                                return true;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i13 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i12 = 1802;
        }
        return false;
    }
}
