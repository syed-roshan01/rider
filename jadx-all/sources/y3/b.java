package y3;

import a.C0001;
import a.C0002;
import android.content.res.AssetManager;
import com.google.android.gms.measurement.internal.C0104;
import com.google.firebase.dynamicloading.C0139;
import com.google.firebase.firestore.core.C0153;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.util.C0166;
import com.google.firebase.measurement_impl.C0185;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0197;
import d1.C0213;
import dagger.hilt.internal.aggregatedroot.C0247;
import dagger.hilt.internal.aliasof.C0248;
import f0.C0272;
import fa.C0281;
import g7.C0293;
import h8.C0315;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import l6.C0344;
import m3.C0353;
import n9.C0367;
import o7.i2;
import r.C0393;
import v7.C0450;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f747short = {913, 925, 927, 898, 896, 919, 897, 897, 919, 918};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f16877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f16878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f16880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16882f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c[] f16883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f16884h;

    public b(AssetManager assetManager, m.a aVar, d dVar, String str, File file) {
        this.f16877a = aVar;
        this.f16878b = dVar;
        this.f16881e = str;
        this.f16880d = file;
        int iM7181 = C0367.m7181();
        byte[] bArrM2685 = null;
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM7181 > 34 ? 1709 : 1678;
                    break;
                case 204:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = 1771;
                                continue;
                            case 54:
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    switch (iM7181) {
                        case 26:
                            bArrM2685 = C0139.m2685();
                            break;
                        case 27:
                            bArrM2685 = C0272.m5231();
                            int i12 = 49666;
                            while (true) {
                                i12 ^= 49683;
                                switch (i12) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i12 = 49697;
                                        continue;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 28:
                        case 29:
                        case FirestoreIndexValueWriter.INDEX_TYPE_BLOB /* 30 */:
                            bArrM2685 = C0293.m5618();
                            int i13 = 48891;
                            while (true) {
                                i13 ^= 48908;
                                switch (i13) {
                                    case 22:
                                        break;
                                    case 503:
                                        i13 = 48922;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                            bArrM2685 = C0197.m3782();
                            int i14 = 48767;
                            while (true) {
                                i14 ^= 48784;
                                switch (i14) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case 239:
                                        i14 = 48798;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        default:
                            int i15 = 1864;
                            while (true) {
                                i15 ^= 1881;
                                switch (i15) {
                                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                        i15 = 48674;
                                        continue;
                                    case 47483:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
        this.f16879c = bArrM2685;
        int iM2938 = C0153.m2938();
        int i16 = 49790;
        while (true) {
            i16 ^= 49807;
            switch (i16) {
                case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    break;
                case 51:
                    return;
                case 84:
                    System.out.println(Float.parseFloat(C0353.m6906("D25rNeA3")));
                    return;
                case 241:
                    if (iM2938 >= 0) {
                        i16 = 49883;
                    }
                    break;
                default:
                    continue;
            }
            i16 = 49852;
        }
    }

    /* JADX INFO: renamed from: ۡ۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m9274() {
        int iM2034 = C0104.m2034();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2034 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f747short;
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

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            FileInputStream fileInputStreamM42 = C0001.m42(C0247.m4722(assetManager, str));
            int i10 = 1616;
            while (true) {
                i10 ^= 1633;
                switch (i10) {
                    case Code.UNAVAILABLE /* 14 */:
                        return fileInputStreamM42;
                    case 49:
                        i10 = 1647;
                        break;
                }
            }
        } catch (FileNotFoundException e4) {
            String strM4049 = C0213.m4049(e4);
            int i11 = 1740;
            while (true) {
                i11 ^= 1757;
                switch (i11) {
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        i11 = strM4049 != null ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                        boolean zM4748 = C0248.m4748(strM4049, C0344.m6742(m9274(), 0, C0281.f425 ^ (-458), 1010));
                        int i12 = 1864;
                        while (true) {
                            i12 ^= 1881;
                            switch (i12) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i12 = zM4748 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    C0002.m56(C0315.m6085(this));
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        C0166.m3180(C0450.m8759(this), new a(this, i10, serializable, 0));
        int iM3538 = C0185.m3538();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3538 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0393.m7695("IRxS3Nql6v6kKMPbo4SHNruh")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }
}
