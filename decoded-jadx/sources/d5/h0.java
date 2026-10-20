package d5;

import aa.C0012;
import androidx.compose.ui.graphics.C0031;
import com.google.android.gms.auth.api.signin.C0080;
import com.google.crypto.tink.shaded.protobuf.C0110;
import com.google.firebase.abt.C0113;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfiginterop.C0202;
import d1.C0212;
import dagger.hilt.android.internal.migration.C0232;
import f.C0269;
import g5.C0291;
import h4.C0305;
import p5.C0377;
import r7.C0403;
import s.C0407;
import v0.C0442;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4541a;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f265short = {1154, 1189, 1197, 1192, 1185, 1184, 1252, 1200, 1195, 1252, 1206, 1185, 1205, 1201, 1185, 1207, 1200, 1252, 1175, 1196, 1197, 1214, 1201, 1199, 1201, 1252, 1204, 1185, 1206, 1193, 1197, 1207, 1207, 1197, 1195, 1194, 1278, 1252, 1162, 1201, 1212, 1205, 1205, 1165, 1208, 1193, 1180, 1185, 1212, 1210, 1196, 1197, 1206, 1195};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f4539b = new h0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f4540c = new h0(1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i10) {
        super(0);
        this.f4541a = i10;
        int iM8630 = C0442.m8630();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8630 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Double.parseDouble(C0110.m2122("avWz1s4rUQT")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4176() {
        int iM7389 = C0377.m7389();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7389 > 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f265short;
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

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVarM238 = C0012.m238();
        switch (C0113.m2183(this)) {
            case 0:
                C0407.m7991(this);
                return lVarM238;
            default:
                C0407.m7991(this);
                return lVarM238;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4177invoke() {
        switch (C0113.m2183(this)) {
            case 0:
                try {
                    C0149.m2847(C0269.f349 ^ (-9964));
                    int i10 = 1740;
                    while (true) {
                        i10 ^= 1757;
                        switch (i10) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i10 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                } catch (Exception e4) {
                    C0291.m5604(C0232.m4477(m4176(), 0, C0305.f453 ^ (-338), 1220), C0212.m4049(e4), C0080.m1728(m4176(), 38, C0202.f226 ^ (-437), 1241));
                    return;
                }
                break;
            default:
                int iM7911 = C0403.m7911();
                int i11 = 1616;
                while (true) {
                    i11 ^= 1633;
                    switch (i11) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case 49:
                            if (iM7911 >= 0) {
                                i11 = 1709;
                            }
                            break;
                        case 204:
                            System.out.println(Integer.parseInt(C0031.m609("hexVi7SaeJMuTYDvL5fQ4AvZBB8")));
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i11 = 1678;
                }
                break;
        }
    }
}
