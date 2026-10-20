package k6;

import android.os.C0013;
import com.google.firebase.installations.local.C0176;
import com.google.firebase.remoteconfig.internal.Code;
import d8.C0221;
import d9.C0225;
import g2.C0287;
import h.C0297;
import h4.C0305;
import h5.C0306;
import n7.C0363;
import o8.C0371;
import v.C0439;
import w.C0453;
import w5.C0463;

/* JADX INFO: loaded from: classes.dex */
public abstract class m7 extends k7 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f565short = {2228, 2197, 2190, 2266, 2195, 2196, 2195, 2190, 2195, 2203, 2198, 2195, 2176, 2207, 2206, 1513, 1483, 1476, 1421, 1502, 1418, 1475, 1476, 1475, 1502, 1475, 1483, 1478, 1475, 1488, 1487, 1418, 1502, 1501, 1475, 1481, 1487};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10212c;

    public m7(p7 p7Var) {
        super(p7Var);
        p7 p7VarM7289 = C0371.m7289(this);
        p7VarM7289.f10303r = C0013.m251(p7VarM7289) + (C0439.f710 ^ 965);
        int iM7127 = C0363.m7127();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7127 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0305.m5899("UVQyWjXJC")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۢۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6577() {
        int iM9033 = C0463.m9033();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9033 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f565short;
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

    public final void p() {
        boolean zM8853 = C0453.m8853(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (zM8853) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    throw new IllegalStateException(C0287.m5538(m6577(), 0, C0221.f301 ^ (-742), 2298));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public final void q() {
        boolean zM8853 = C0453.m8853(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (!zM8853) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    C0225.m4342(this);
                    p7 p7VarM7289 = C0371.m7289(this);
                    p7VarM7289.f10304s = (C0176.m3362(p7VarM7289) - 18) + 1 + 18;
                    this.f10212c = true;
                    return;
                case 239:
                    throw new IllegalStateException(C0306.m5911(m6577(), 15, C0297.f445 ^ (-512), 1450));
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    public abstract boolean r();
}
