package a5;

import com.google.firebase.encoders.config.C0142;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.measurement.C0182;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.internal.aliasof.C0248;
import dagger.hilt.internal.generatesrootinput.C0251;
import h5.C0309;
import j3.C0326;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import k3.C0336;
import n.C0361;
import o7.i2;
import okhttp3.internal.publicsuffix.C0373;
import q2.C0385;
import v.C0440;
import y9.C0480;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f15short = {2143, 2142, 2124, 2087, 2098, 1585, 1578, 1558, 1585, 1591, 1580, 1579, 1570, 1645, 1643, 1643, 1643, 1644};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q8.i f1259a = new q8.i(C0326.m6297());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q8.i f1260b = new q8.i(C0385.m7538());

    public static final String a(InputStream inputStream) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (inputStream == null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    String strM8581 = C0440.m8581();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                break;
                            case 54:
                                return strM8581;
                        }
                    }
                    break;
                case 239:
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            try {
                                int iM4740 = C0248.m4740(bufferedInputStream, bArr);
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = iM4740 != -1 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            try {
                                                C0309.m5963(bufferedInputStream);
                                                break;
                                            } catch (Exception e4) {
                                                int i13 = 49790;
                                                while (true) {
                                                    i13 ^= 49807;
                                                    switch (i13) {
                                                        case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                            break;
                                                        case 241:
                                                            i13 = 49821;
                                                            break;
                                                    }
                                                }
                                            }
                                            String strM7535 = C0385.m7535(byteArrayOutputStream, C0251.m4786(m131(), 0, C0373.f643 ^ (-479), 2058));
                                            C0336.m6501(strM7535, C0182.m3474(m131(), 5, C0480.f753 ^ (-948), 1605));
                                            return strM7535;
                                        case 47417:
                                            C0361.m7075(byteArrayOutputStream, bArr, 0, iM4740);
                                            int i14 = 48767;
                                            while (true) {
                                                i14 ^= 48784;
                                                switch (i14) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i14 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            } catch (Exception e10) {
                                int i15 = 49666;
                                while (true) {
                                    i15 ^= 49683;
                                    switch (i15) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i15 = 49697;
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                            break;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        int i16 = 48891;
                        while (true) {
                            i16 ^= 48908;
                            switch (i16) {
                                case 22:
                                    try {
                                        C0309.m5963(bufferedInputStream);
                                        break;
                                    } catch (Exception e11) {
                                        int i17 = 49914;
                                        while (true) {
                                            i17 ^= 49931;
                                            switch (i17) {
                                                case 497:
                                                    i17 = 50596;
                                                    break;
                                                case 1711:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                    throw th;
                                case 503:
                                    i16 = 48922;
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m131() {
        int iM2725 = C0142.m2725();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2725 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f15short;
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
