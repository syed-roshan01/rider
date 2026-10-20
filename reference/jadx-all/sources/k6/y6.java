package k6;

import android.support.v4.app.C0015;
import androidx.compose.ui.draw.C0029;
import androidx.core.app.C0040;
import androidx.versionedparcelable.C0048;
import com.google.firebase.components.C0135;
import com.google.firebase.concurrent.C0136;
import com.google.firebase.emulators.C0141;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.platforminfo.C0193;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.C0256;
import f.C0271;
import h7.C0311;
import l6.C0344;
import m1.C0351;
import m7.C0358;
import o5.C0371;
import t9.C0428;
import u.C0429;
import u1.C0433;
import u3.C0435;
import w9.C0466;
import z.C0482;

/* JADX INFO: loaded from: classes.dex */
public final class y6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f603short = {1405, 1361, 1360, 1360, 1371, 1373, 1354, 1371, 1370, 1310, 1354, 1361, 1310, 1356, 1371, 1363, 1361, 1354, 1371, 1310, 1357, 1371, 1356, 1352, 1367, 1373, 1371, 3094, 3130, 3131, 3131, 3120, 3126, 3105, 3120, 3121, 3189, 3105, 3130, 3189, 3110, 3120, 3111, 3107, 3132, 3126, 3120};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3 f10584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z6 f10585c;

    public /* synthetic */ y6(z6 z6Var, y3 y3Var, int i10) {
        this.f10583a = i10;
        this.f10585c = z6Var;
        this.f10584b = y3Var;
        int iM925 = C0048.m925();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM925 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(C0429.m8399("oAkDSETme"));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۤۤ۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m6613() {
        int iM7001 = C0358.m7001();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7001 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f603short;
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
        switch (C0351.m6862(this)) {
            case 0:
                synchronized (C0193.m3685(this)) {
                    try {
                        C0193.m3685(this).f10617a = false;
                        boolean zM8489 = C0435.m8489(C0371.m7272(C0193.m3685(this)));
                        int i10 = 48891;
                        while (true) {
                            i10 ^= 48908;
                            switch (i10) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    i10 = !zM8489 ? 49635 : 48953;
                                    break;
                                case 32495:
                                    C0135.m2604(C0136.m2634(C0029.m572(C0371.m7272(C0193.m3685(this)))), C0433.m8458(m6613(), 27, C0344.f614 ^ 395, 3157));
                                    s6 s6VarM7272 = C0371.m7272(C0193.m3685(this));
                                    y3 y3VarM3055 = C0160.m3055(this);
                                    C0040.m791(s6VarM7272);
                                    C0271.m5173(y3VarM3055);
                                    s6VarM7272.f10358d = y3VarM3055;
                                    C0311.m6011(s6VarM7272);
                                    C0141.m2713(s6VarM7272);
                                    int i11 = 49666;
                                    while (true) {
                                        i11 ^= 49683;
                                        switch (i11) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i11 = 49697;
                                                continue;
                                            case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
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
                        break;
                    } catch (Throwable th) {
                        int i12 = 49790;
                        while (true) {
                            i12 ^= 49807;
                            switch (i12) {
                                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                    throw th;
                                case 241:
                                    i12 = 49821;
                                    break;
                            }
                        }
                    }
                }
                return;
            default:
                synchronized (C0193.m3685(this)) {
                    try {
                        C0193.m3685(this).f10617a = false;
                        boolean zM84810 = C0435.m8489(C0371.m7272(C0193.m3685(this)));
                        int i13 = 1616;
                        while (true) {
                            i13 ^= 1633;
                            switch (i13) {
                                case Code.UNAVAILABLE /* 14 */:
                                    break;
                                case 49:
                                    if (!zM84810) {
                                        i13 = 1709;
                                    }
                                    break;
                                case 204:
                                    C0135.m2604(C0466.m9073(C0029.m572(C0371.m7272(C0193.m3685(this)))), C0256.m4884(m6613(), 0, C0482.f755 ^ (-564), 1342));
                                    s6 s6VarM7273 = C0371.m7272(C0193.m3685(this));
                                    y3 y3VarM3056 = C0160.m3055(this);
                                    C0040.m791(s6VarM7273);
                                    C0271.m5173(y3VarM3056);
                                    s6VarM7273.f10358d = y3VarM3056;
                                    C0311.m6011(s6VarM7273);
                                    C0141.m2713(s6VarM7273);
                                    int i14 = 1740;
                                    while (true) {
                                        i14 ^= 1757;
                                        switch (i14) {
                                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                                i14 = 1771;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    break;
                                default:
                                    continue;
                            }
                            i13 = 1678;
                        }
                    } catch (Throwable th2) {
                        int i15 = 1864;
                        while (true) {
                            i15 ^= 1881;
                            switch (i15) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i15 = 48674;
                                    break;
                                case 47483:
                                    throw th2;
                            }
                        }
                    }
                }
                int iM294 = C0015.m294();
                int i16 = 48767;
                while (true) {
                    i16 ^= 48784;
                    switch (i16) {
                        case Code.UNAVAILABLE /* 14 */:
                            break;
                        case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                            return;
                        case 76:
                            System.out.println(Integer.decode(C0428.m8390("MRfshV")));
                            return;
                        case 239:
                            i16 = iM294 >= 0 ? 48860 : 48829;
                            break;
                        default:
                            break;
                    }
                }
                break;
        }
    }
}
