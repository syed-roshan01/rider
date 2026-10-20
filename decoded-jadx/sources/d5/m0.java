package d5;

import aa.C0012;
import androidx.compose.foundation.layout.C0022;
import androidx.compose.foundation.relocation.C0024;
import androidx.compose.ui.layout.C0036;
import com.auto.accept.ui.viewmodel.MainViewModel;
import com.google.android.gms.internal.p000authapiphone.C0090;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.firestore.model.C0161;
import com.google.firebase.installations.interop.C0173;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.messaging.reporting.C0188;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0224;
import dagger.hilt.android.components.C0227;
import dagger.hilt.android.internal.modules.C0234;
import dagger.hilt.codegen.C0241;
import f6.C0278;
import h5.C0308;
import java.util.ArrayList;
import k3.C0334;
import k3.C0335;
import m1.C0351;
import m5.C0354;
import r1.C0393;
import s7.C0415;
import v7.C0449;
import v8.C0450;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f278short = {491, 496, 469, 492, 496, 497, 439, 433, 433, 433, 438};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainViewModel f4672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0.g1 f4675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i10, m0.g1 g1Var, MainViewModel mainViewModel, boolean z10) {
        super(0);
        this.f4672a = mainViewModel;
        this.f4673b = i10;
        this.f4674c = z10;
        this.f4675d = g1Var;
        int iM4512 = C0234.m4512();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4512 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.decode(C0090.m1935("gXKu05D3jj")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۧۥ۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m4190() {
        int iM8792 = C0450.m8792();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8792 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f278short;
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
    public final Object invoke() {
        z4.d dVarM5385 = C0278.m5385(C0218.m4221(this));
        ArrayList arrayListM8147 = C0415.m8147(C0024.m468(dVarM5385));
        int iM6900 = C0351.m6900(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    i10 = iM6900 >= 0 ? 1709 : 1678;
                    break;
                case 204:
                    int iM4637 = C0241.m4637(arrayListM8147);
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                i11 = iM6900 < iM4637 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case ServiceStarter.ERROR_UNKNOWN /* 500 */:
                                C0022.m431(arrayListM8147, iM6900);
                                String strM6960 = C0354.m6960(C0308.m5952(dVarM5385), arrayListM8147);
                                C0335.m6501(strM6960, C0161.m3082(m4190(), 0, C0173.f197 ^ (-805), 415));
                                C0107.m2085(C0393.m7699(dVarM5385), strM6960);
                                C0227.m4382(C0188.m3596(dVarM5385), arrayListM8147);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        boolean zM707 = C0036.m707(this);
        int i12 = 1864;
        while (true) {
            i12 ^= 1881;
            switch (i12) {
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (zM707) {
                        i12 = 48736;
                    }
                    break;
                case 47384:
                    break;
                case 47417:
                    C0224.m4315(C0449.m8752(this), C0334.m6483());
                    break;
                case 47483:
                    break;
                default:
                    continue;
            }
            i12 = 48705;
        }
        return C0012.m238();
    }
}
