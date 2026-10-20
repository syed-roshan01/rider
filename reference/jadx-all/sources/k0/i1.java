package k0;

import a.C0000;
import androidx.profileinstaller.C0045;
import c1.C0059;
import com.google.android.datatransport.cct.C0076;
import com.google.android.gms.common.api.internal.C0082;
import com.google.firebase.annotations.C0127;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.firestore.core.C0152;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.internal.Code;
import m1.C0351;
import r6.C0402;
import s0.C0411;
import v0.C0443;
import w.C0454;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends y0.n implements t1.m, t1.b0 {
    @Override // t1.b0
    public final r1.k0 f(r1.l0 l0Var, r1.i0 i0Var, long j10) {
        boolean z10;
        int iM1647;
        int iM6867;
        long jM1751 = C0082.m1751();
        r1.x0 x0VarM8844 = C0454.m8844(i0Var, j10);
        boolean zM2438 = C0126.m2438(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = zM2438 ? 1709 : 1678;
                    break;
                case 204:
                    boolean zM14 = C0000.m14((Boolean) C0045.m881(this, C0402.m7870()));
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = zM14 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                z10 = false;
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                z10 = true;
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                            i12 = 48674;
                                            continue;
                                        case 47483:
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
                case 239:
                    z10 = false;
                    break;
                default:
                    break;
            }
        }
        int i13 = 48767;
        while (true) {
            i13 ^= 48784;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_GEOPOINT /* 45 */:
                    iM1647 = C0076.m1647(x0VarM8844);
                    break;
                case 76:
                    iM1647 = C0059.m1119(C0076.m1647(x0VarM8844), C0152.m2912(l0Var, C0125.m2404(jM1751)));
                    int i14 = 48891;
                    while (true) {
                        i14 ^= 48908;
                        switch (i14) {
                            case 22:
                                break;
                            case 503:
                                i14 = 48922;
                                continue;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    i13 = z10 ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        int i15 = 49666;
        while (true) {
            i15 ^= 49683;
            switch (i15) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (z10) {
                        i15 = 49759;
                    }
                    break;
                case FirestoreIndexValueWriter.INDEX_TYPE_ARRAY /* 50 */:
                    break;
                case 76:
                    iM6867 = C0059.m1119(C0351.m6867(x0VarM8844), C0152.m2912(l0Var, C0443.m8644(jM1751)));
                    int i16 = 49790;
                    while (true) {
                        i16 ^= 49807;
                        switch (i16) {
                            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                break;
                            case 241:
                                i16 = 49821;
                                break;
                        }
                    }
                    break;
                case 83:
                    iM6867 = C0351.m6867(x0VarM8844);
                    break;
                default:
                    continue;
            }
            i15 = 49728;
        }
        return C0411.m8048(l0Var, iM1647, iM6867, C0127.m2452(), new y.h0(iM1647, x0VarM8844, iM6867));
    }
}
