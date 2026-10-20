package f0;

import androidx.appcompat.widget.C0020;
import com.google.firebase.firestore.ktx.C0156;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.interop.C0196;
import j2.C0324;
import o7.i2;
import s.C0408;
import u.C0429;
import u1.t2;
import z0.C0483;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f386short = {1622, 1624, 1604, 1631, 1618, 1628, 1615, 1625, 1660, 1630, 1609, 1620, 1618, 1619, 1614};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2 f6014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a1 f6015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c1.e f6016c;

    public z0(t2 t2Var) {
        this.f6014a = t2Var;
        int iM7989 = C0408.m7989();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM7989 <= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.valueOf(C0196.m3758("RMtPRIiuepJ8tXPRv1I46A3iUun")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    /* JADX INFO: renamed from: ۟ۥ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5214() {
        int iM8409 = C0429.m8409();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM8409 < 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return f386short;
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

    public final a1 a() {
        a1 a1VarM6256 = C0324.m6256(this);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (a1VarM6256 != null) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    return a1VarM6256;
                case 239:
                    C0156.m2979(C0483.m9384(m5214(), 0, C0020.f40 ^ (-662), 1597));
                    throw null;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }
}
