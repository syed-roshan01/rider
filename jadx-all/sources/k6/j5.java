package k6;

import android.os.Bundle;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.foundation.layout.C0022;
import androidx.fragment.app.C0042;
import androidx.profileinstaller.C0045;
import b8.C0055;
import c3.C0063;
import c7.C0068;
import com.google.android.gms.auth.api.signin.C0081;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0190;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0226;
import d9.C0227;
import dagger.hilt.android.internal.migration.C0233;
import ea.C0269;
import f.C0270;
import g5.C0291;
import g5.C0292;
import g7.C0293;
import h4.C0305;
import m5.C0355;
import m7.C0357;
import m9.C0360;
import p0.C0374;
import q6.C0389;
import t7.C0426;
import x5.C0471;
import z3.C0486;

/* JADX INFO: loaded from: classes.dex */
public final class j5 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f554short = {1166, 1182, 1167, 1176, 1176, 1171, 1186, 1171, 1180, 1168, 1176, 315, 299, 314, 301, 301, 294, 279, 299, 292, 297, 315, 315, 1156, 1172, 1157, 1170, 1170, 1177, 1192, 1153, 1182, 1170, 1152};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10125f;

    public /* synthetic */ j5(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f10120a = i10;
        this.f10125f = obj;
        this.f10121b = obj2;
        this.f10122c = obj3;
        this.f10124e = obj4;
        this.f10123d = j10;
        int iM820 = C0042.m820();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM820 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0293.m5632("MF9fCYQuauizdvGHvZRqkVreSfM")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۡۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6566() {
        int iM5605 = C0292.m5605();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM5605 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f554short;
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
        Object objM875 = C0045.m875(this);
        int iM1743 = C0081.m1743(this);
        Object objM4333 = C0226.m4333(this);
        Object objM2429 = C0126.m2429(this);
        Object objM3637 = C0190.m3637(this);
        switch (iM1743) {
            case 0:
                String str = (String) objM2429;
                int i10 = 1864;
                while (true) {
                    i10 ^= 1881;
                    switch (i10) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (str == null) {
                                i10 = 48736;
                            }
                            break;
                        case 47384:
                            q6 q6Var = new q6((String) objM875, str, C0374.m7337(this));
                            p7 p7VarM5151 = C0270.m5151((h5) objM3637);
                            String str2 = (String) objM4333;
                            C0063.m1219(C0486.m9461(p7VarM5151));
                            String strM6995 = C0357.m6995(p7VarM5151);
                            int i11 = 49914;
                            while (true) {
                                i11 ^= 49931;
                                switch (i11) {
                                    case 497:
                                        i11 = strM6995 != null ? 50658 : 50627;
                                        break;
                                    case 1711:
                                        break;
                                    case 1736:
                                        break;
                                    case 1769:
                                        C0016.m321(strM6995, str2);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            p7VarM5151.F = str2;
                            p7VarM5151.E = q6Var;
                            break;
                        case 47417:
                            p7 p7VarM5152 = C0270.m5151((h5) objM3637);
                            String str3 = (String) objM4333;
                            C0063.m1219(C0486.m9461(p7VarM5152));
                            String strM6996 = C0357.m6995(p7VarM5152);
                            int i12 = 48767;
                            while (true) {
                                i12 ^= 48784;
                                switch (i12) {
                                    case Code.UNAVAILABLE /* 14 */:
                                        break;
                                    case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                                        break;
                                    case 76:
                                        boolean zM321 = C0016.m321(strM6996, str3);
                                        int i13 = 48891;
                                        while (true) {
                                            i13 ^= 48908;
                                            switch (i13) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    break;
                                                case 503:
                                                    i13 = !zM321 ? 49635 : 48953;
                                                    break;
                                                case 32495:
                                                    int i14 = 49666;
                                                    while (true) {
                                                        i14 ^= 49683;
                                                        switch (i14) {
                                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                                i14 = 49697;
                                                                break;
                                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i12 = strM6996 != null ? 48860 : 48829;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            p7VarM5152.F = str3;
                            p7VarM5152.E = null;
                            int i15 = 49790;
                            while (true) {
                                i15 ^= 49807;
                                switch (i15) {
                                    case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                        break;
                                    case 241:
                                        i15 = 49821;
                                        break;
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
                break;
            case 1:
                C0227.m4361((y5) objM3637, (String) objM2429, (String) objM4333, objM875, C0374.m7337(this));
                break;
            default:
                p6 p6Var = (p6) objM3637;
                Bundle bundle = (Bundle) objM2429;
                q6 q6Var2 = (q6) objM4333;
                q6 q6Var3 = (q6) objM875;
                long jM7337 = C0374.m7337(this);
                int i16 = 1616;
                while (true) {
                    i16 ^= 1633;
                    switch (i16) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            i16 = bundle != null ? 1709 : 1678;
                            break;
                        case 204:
                            C0055.m1069(bundle, C0233.m4477(m6566(), 0, C0360.f630 ^ 306, 1277));
                            C0055.m1069(bundle, C0068.m1331(m6566(), 11, C0022.f42 ^ (-678), 328));
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
                C0305.m5864(p6Var, q6Var2, q6Var3, jM7337, true, C0389.m7614(C0355.m6951(p6Var), C0471.m9159(m6566(), 23, C0269.f348 ^ 757, 1271), bundle, null, false));
                int iM8351 = C0426.m8351();
                int i17 = 1740;
                while (true) {
                    i17 ^= 1757;
                    switch (i17) {
                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                            if (iM8351 >= 0) {
                                i17 = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                            System.out.println(Integer.valueOf(C0291.m5592("gBn9oiffhp7B9kUzc3")));
                            break;
                        default:
                            continue;
                    }
                    i17 = 1802;
                }
                break;
        }
    }
}
