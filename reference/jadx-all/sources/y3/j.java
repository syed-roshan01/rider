package y3;

import c0.C0057;
import c1.C0059;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.firebase.analytics.connector.C0116;
import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.iid.internal.C0168;
import com.google.firebase.internal.api.C0178;
import com.google.firebase.messaging.C0192;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.C0195;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.C0209;
import d7.C0220;
import d7.C0221;
import dagger.hilt.internal.aggregatedroot.C0247;
import dagger.hilt.internal.aliasof.C0248;
import g8.C0294;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import o7.i2;
import u8.C0439;
import v0.C0442;
import v8.C0451;
import z7.C0490;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16914d;

    public j(int i10, int i11, long j10, long j11) {
        this.f16911a = i10;
        this.f16912b = i11;
        this.f16913c = j10;
        this.f16914d = j11;
        int iM4732 = C0248.m4732();
        int i12 = 1616;
        while (true) {
            i12 ^= 1633;
            switch (i12) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4732 >= 0) {
                        i12 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0451.m8771("cXsYratdbTV2j6v")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i12 = 1678;
        }
    }

    public static j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(C0294.m5647(dataInputStream), C0294.m5647(dataInputStream), C0116.m2235(dataInputStream), C0116.m2235(dataInputStream));
            C0140.m2704(dataInputStream);
            return jVar;
        } catch (Throwable th) {
            try {
                C0140.m2704(dataInputStream);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            throw th;
                        case 49:
                            i10 = 1647;
                            continue;
                        default:
                            continue;
                    }
                }
            } catch (Throwable th2) {
                C0442.m8620(th, th2);
            }
        }
    }

    public final void b(File file) {
        C0195.m3735(file);
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            C0059.m1129(dataOutputStream, C0209.m4015(this));
            C0059.m1129(dataOutputStream, C0192.m3675(this));
            C0192.m3668(dataOutputStream, C0059.m1124(this));
            C0192.m3668(dataOutputStream, C0168.m3225(this));
            C0221.m4253(dataOutputStream);
        } catch (Throwable th) {
            try {
                C0221.m4253(dataOutputStream);
                int i10 = 1616;
                while (true) {
                    i10 ^= 1633;
                    switch (i10) {
                        case Code.UNAVAILABLE /* 14 */:
                            throw th;
                        case 49:
                            i10 = 1647;
                            continue;
                        default:
                            continue;
                    }
                }
            } catch (Throwable th2) {
                C0442.m8620(th, th2);
            }
        }
    }

    public final boolean equals(Object obj) {
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (this == obj) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (obj != null) {
                                    i11 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                boolean z10 = obj instanceof j;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            if (!z10) {
                                                i12 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            j jVar = (j) obj;
                                            int iM3675 = C0192.m3675(this);
                                            int iM3676 = C0192.m3675(jVar);
                                            int i13 = 48891;
                                            while (true) {
                                                i13 ^= 48908;
                                                switch (i13) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 503:
                                                        i13 = iM3675 == iM3676 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        long jM1124 = C0059.m1124(this);
                                                        long jM1125 = C0059.m1124(jVar);
                                                        int i14 = 49666;
                                                        while (true) {
                                                            i14 ^= 49683;
                                                            switch (i14) {
                                                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                    i14 = jM1124 == jM1125 ? 49759 : 49728;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                                case 76:
                                                                    int iM4015 = C0209.m4015(this);
                                                                    int iM4016 = C0209.m4015(jVar);
                                                                    int i15 = 49790;
                                                                    while (true) {
                                                                        i15 ^= 49807;
                                                                        switch (i15) {
                                                                            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                                break;
                                                                            case 51:
                                                                                break;
                                                                            case 84:
                                                                                long jM3225 = C0168.m3225(this);
                                                                                long jM3226 = C0168.m3225(jVar);
                                                                                int i16 = 49914;
                                                                                while (true) {
                                                                                    i16 ^= 49931;
                                                                                    switch (i16) {
                                                                                        case 497:
                                                                                            i16 = jM3225 == jM3226 ? 50658 : 50627;
                                                                                            break;
                                                                                        case 1711:
                                                                                            break;
                                                                                        case 1736:
                                                                                            break;
                                                                                        case 1769:
                                                                                            int i17 = 50689;
                                                                                            while (true) {
                                                                                                i17 ^= 50706;
                                                                                                switch (i17) {
                                                                                                    case 19:
                                                                                                        i17 = 50720;
                                                                                                        break;
                                                                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                                                        return true;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 241:
                                                                                i15 = iM4015 == iM4016 ? 49883 : 49852;
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
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
                                            return false;
                                        case 47417:
                                            int i18 = 48767;
                                            while (true) {
                                                i18 ^= 48784;
                                                switch (i18) {
                                                    case Code.UNAVAILABLE /* 14 */:
                                                        break;
                                                    case 239:
                                                        i18 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48705;
                                }
                                break;
                            default:
                                continue;
                        }
                        i11 = 1802;
                    }
                    return false;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final int hashCode() {
        long jM3225 = 0;
        String str = "ۦۥۨ";
        Long lM8554 = null;
        Long lM8555 = null;
        Integer numM1083 = null;
        Integer numM1084 = null;
        Object[] objArr = null;
        int i10 = 0;
        int iM9537 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 1746687:
                    objArr[i10] = lM8555;
                    str = "ۨۥۣ";
                    break;
                case 1747776:
                    i10 = iM9537 ^ 184;
                    str = "ۤۨ۠";
                    break;
                case 1747840:
                    str = "ۢۥۢ";
                    iM9537 = C0247.f326;
                    break;
                case 1749577:
                    objArr[i10] = lM8554;
                    str = "ۧۥ۠";
                    break;
                case 1749727:
                    str = "ۤ۠ۦ";
                    lM8555 = C0439.m8554(jM3225);
                    break;
                case 1749759:
                    i10 = iM9537 ^ (-653);
                    str = "ۢ۟ۦ";
                    break;
                case 1750688:
                    str = "ۣۨۧ";
                    numM1083 = C0057.m1083(iM9537);
                    break;
                case 1750755:
                    i10 = iM9537 ^ 257;
                    str = "۟۟۟";
                    break;
                case 1751530:
                    str = "۟ۨۢ";
                    objArr = new Object[4];
                    break;
                case 1751655:
                    objArr[i10] = numM1083;
                    str = "ۣۤۧ";
                    break;
                case 1751709:
                    str = "ۣۤۡ";
                    iM9537 = C0209.m4015(this);
                    break;
                case 1751744:
                    str = "ۣۦۦ";
                    iM9537 = C0220.f299;
                    break;
                case 1751772:
                    objArr[i10] = numM1084;
                    str = "۠ۥۥ";
                    break;
                case 1753420:
                    return iM9537;
                case 1753609:
                    str = "ۨۡۦ";
                    iM9537 = C0192.m3675(this);
                    break;
                case 1754375:
                    lM8554 = C0439.m8554(jM3225);
                    str = "ۤۦ۟";
                    break;
                case 1754562:
                    str = "ۨۢۧ";
                    iM9537 = C0178.f202;
                    break;
                case 1754570:
                    jM3225 = C0059.m1124(this);
                    str = "ۧ۟۟";
                    break;
                case 1755405:
                    str = "ۧۥۨ";
                    numM1084 = C0057.m1083(iM9537);
                    break;
                case 1755437:
                    i10 = iM9537 ^ 153;
                    str = "ۤۤۧ";
                    break;
                case 1755468:
                    jM3225 = C0168.m3225(this);
                    str = "ۢۤۡ";
                    break;
                case 1755526:
                    str = "ۦ۟ۥ";
                    iM9537 = C0490.m9537(objArr);
                    break;
                default:
                    str = "ۣۣ۠";
                    iM9537 = C0081.f115;
                    break;
            }
        }
    }
}
