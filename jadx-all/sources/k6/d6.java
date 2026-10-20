package k6;

import android.support.v4.app.C0014;
import androidx.compose.ui.draw.C0029;
import b.C0049;
import com.google.firebase.remoteconfig.internal.Code;
import d4.C0218;
import dagger.hilt.C0256;
import f.C0271;
import i6.C0320;
import java.util.concurrent.atomic.AtomicReference;
import k8.C0339;
import p7.C0379;
import r1.C0394;
import r2.C0398;
import t1.C0420;
import t8.C0427;
import u4.C0437;
import u8.C0439;
import v8.C0451;
import w9.C0466;
import x2.C0468;

/* JADX INFO: loaded from: classes.dex */
public final class d6 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f536short = {3314, 3268, 3282, 3282, 3272, 3278, 3279, 3201, 3285, 3272, 3276, 3268, 3278, 3284, 3285, 3201, 3269, 3284, 3283, 3264, 3285, 3272, 3278, 3279, 3201, 3282, 3268, 3285};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f9979c;

    public /* synthetic */ d6(y5 y5Var, long j10, int i10) {
        this.f9977a = i10;
        this.f9979c = y5Var;
        this.f9978b = j10;
        int iM9101 = C0468.m9101();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9101 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0218.m4145("GDBitIcb9LrKR32lhAV")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۣۥۦۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6548() {
        int iM269 = C0014.m269();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM269 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f536short;
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
        int iM8780 = C0451.m8780(this);
        y5 y5VarM5172 = C0271.m5172(this);
        long jM951 = C0049.m951(this);
        switch (iM8780) {
            case 0:
                C0427.m8362(C0256.m4887(C0339.m6640(y5VarM5172)), jM951);
                d4 d4VarM572 = C0029.m572(y5VarM5172);
                C0420.m8245(C0466.m9073(d4VarM572), C0398.m7776(m6548(), 0, C0437.f707 ^ (-261), 3233), C0439.m8554(jM951));
                break;
            default:
                C0320.m6191(y5VarM5172, jM951, true);
                C0379.m7413(C0394.m7706(y5VarM5172), new AtomicReference());
                break;
        }
    }
}
