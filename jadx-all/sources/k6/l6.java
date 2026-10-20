package k6;

import a0.C0003;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.aliasof.C0248;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import n.C0361;
import q1.C0384;

/* JADX INFO: loaded from: classes.dex */
public final class l6 extends o5 {
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0016. Please report as an issue. */
    public static byte[] p(HttpURLConnection httpURLConnection) {
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

    @Override // k6.o5
    public final boolean o() {
        return false;
    }
}
