package d5;

import a.C0000;
import aa.C0012;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.C0014;
import androidx.activity.C0017;
import androidx.annotation.C0019;
import androidx.profileinstaller.C0045;
import c1.C0059;
import c4.C0065;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.crypto.tink.shaded.protobuf.C0111;
import com.google.firebase.abt.C0113;
import com.google.firebase.emulators.C0140;
import com.google.firebase.firestore.auth.C0147;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.heartbeatinfo.C0167;
import com.google.firebase.measurement.C0183;
import com.google.firebase.messaging.reporting.C0189;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0223;
import h1.C0300;
import i.C0315;
import j5.C0327;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import k3.C0335;
import l8.C0345;
import p8.C0380;
import q1.C0383;
import q7.C0389;
import r2.C0394;
import u4.C0435;
import u8.C0438;
import v0.C0443;
import z.C0481;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f267short = {1832, 1843, 1822, 1829, 1832, 1849, 1821, 1838, 1838, 1853, 1829, 1908, 1906, 1906, 1906, 1909};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i10, Object obj, Object obj2) {
        super(1);
        this.f4575a = i10;
        this.f4576b = obj;
        this.f4577c = obj2;
        int iM3510 = C0183.m3510();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM3510 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0345.m6765("1QZzGphwLpbILXJOQ3253THRQHzm")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m4179() {
        int iM874 = C0045.m874();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM874 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f267short;
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

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVarM238 = C0012.m238();
        int iM8555 = C0438.m8555(this);
        Object objM2139 = C0111.m2139(this);
        Object objM7724 = C0394.m7724(this);
        switch (iM8555) {
            case 0:
                Uri uri = (Uri) obj;
                int i10 = 1864;
                while (true) {
                    i10 ^= 1881;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (uri != null) {
                                i10 = 48736;
                            }
                            break;
                        case 47384:
                            break;
                        case 47417:
                            MainViewModel mainViewModel = (MainViewModel) objM2139;
                            try {
                                InputStream inputStreamM9369 = C0481.m9369(C0152.m2915((Context) objM7724), uri);
                                Bitmap bitmapM2814 = C0147.m2814(inputStreamM9369);
                                int i11 = 48767;
                                while (true) {
                                    i11 ^= 48784;
                                    switch (i11) {
                                        case Code.UNAVAILABLE /* 14 */:
                                            break;
                                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                            break;
                                        case 76:
                                            C0140.m2704(inputStreamM9369);
                                            break;
                                        case 239:
                                            if (inputStreamM9369 != null) {
                                                i11 = 48860;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i11 = 48829;
                                }
                                int i12 = 48891;
                                while (true) {
                                    i12 ^= 48908;
                                    switch (i12) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            if (bitmapM2814 != null) {
                                                i12 = 49635;
                                            }
                                            break;
                                        case 32495:
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            int iM6323 = C0327.m6323(bitmapM2814);
                                            int i13 = 49666;
                                            while (true) {
                                                i13 ^= 49683;
                                                switch (i13) {
                                                    case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                        i13 = iM6323 <= 512 ? 49759 : 49728;
                                                        break;
                                                    case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                        break;
                                                    case 76:
                                                        int iM18 = C0000.m18(bitmapM2814);
                                                        int i14 = 49790;
                                                        while (true) {
                                                            i14 ^= 49807;
                                                            switch (i14) {
                                                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    float fM1119 = 512 / C0059.m1119(C0327.m6323(bitmapM2814), C0000.m18(bitmapM2814));
                                                                    bitmapM2814 = C0218.m4212(bitmapM2814, (int) (C0327.m6323(bitmapM2814) * fM1119), (int) (fM1119 * C0000.m18(bitmapM2814)), true);
                                                                    break;
                                                                case 241:
                                                                    i14 = iM18 > 512 ? 49883 : 49852;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        float fM11110 = 512 / C0059.m1119(C0327.m6323(bitmapM2814), C0000.m18(bitmapM2814));
                                                        bitmapM2814 = C0218.m4212(bitmapM2814, (int) (C0327.m6323(bitmapM2814) * fM11110), (int) (fM11110 * C0000.m18(bitmapM2814)), true);
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0189.m3608(bitmapM2814);
                                            C0167.m3198(bitmapM2814, C0389.m7626(), C0065.f85 ^ 716, byteArrayOutputStream);
                                            byte[] bArrM7522 = C0383.m7522(byteArrayOutputStream);
                                            C0335.m6501(bArrM7522, C0443.m8659(m4179(), 0, C0017.f37 ^ (-417), 1884));
                                            C0014.m280(mainViewModel);
                                            String strM5791 = C0300.m5791(C0380.m7458(mainViewModel));
                                            int i15 = 49914;
                                            while (true) {
                                                i15 ^= 49931;
                                                switch (i15) {
                                                    case 497:
                                                        if (strM5791 == null) {
                                                            i15 = 50658;
                                                        }
                                                        break;
                                                    case 1711:
                                                        break;
                                                    case 1736:
                                                        C0383.m7508(C0113.m2178(mainViewModel), null, 0, new f5.d0(mainViewModel, strM5791, bArrM7522, null), C0000.f768 ^ (-118));
                                                        break;
                                                    case 1769:
                                                        int i16 = 50689;
                                                        while (true) {
                                                            i16 ^= 50706;
                                                            switch (i16) {
                                                                case 19:
                                                                    i16 = 50720;
                                                                    break;
                                                                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i15 = 50627;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i12 = 48953;
                                }
                            } catch (Exception e4) {
                                int i17 = 50813;
                                while (true) {
                                    i17 ^= 50830;
                                    switch (i17) {
                                        case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                            break;
                                        case 243:
                                            i17 = 50844;
                                            break;
                                    }
                                }
                            }
                            break;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i10 = 48705;
                }
                return lVarM238;
            case 1:
                return C0223.m4297((c9.c) objM7724, C0315.m6101((List) objM2139, C0435.m8515((Number) obj)));
            case 2:
                switch (iM8555) {
                    case 2:
                        C0065.m1263(C0045.m870((n9.d) objM7724), (Runnable) objM2139);
                        break;
                    default:
                        C0019.m396((u9.d) objM7724, objM2139);
                        int i18 = 1740;
                        while (true) {
                            i18 ^= 1757;
                            switch (i18) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i18 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                }
                return lVarM238;
            default:
                switch (iM8555) {
                    case 2:
                        C0065.m1263(C0045.m870((n9.d) objM7724), (Runnable) objM2139);
                        break;
                    default:
                        C0019.m396((u9.d) objM7724, objM2139);
                        int i19 = 1616;
                        while (true) {
                            i19 ^= 1633;
                            switch (i19) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 49:
                                    i19 = 1647;
                                    break;
                            }
                        }
                        break;
                }
                return lVarM238;
        }
    }
}
