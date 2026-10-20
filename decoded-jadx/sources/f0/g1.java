package f0;

import aa.C0012;
import com.google.firebase.annotations.concurrent.C0126;
import com.google.firebase.components.C0135;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0222;
import e1.C0259;
import m7.C0356;
import o7.i2;
import z8.C0491;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f5709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(k1 k1Var, int i10) {
        super(0);
        this.f5708a = i10;
        this.f5709b = k1Var;
        int iM2434 = C0126.m2434();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM2434 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0491.m9563("FtzS7hbhHIWNQru")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.a
    public final Object invoke() {
        q8.l lVarM238 = C0012.m238();
        k1 k1VarM6996 = C0356.m6996(this);
        int iM2607 = C0135.m2607(this);
        switch (iM2607) {
            case 0:
                switch (iM2607) {
                    case 0:
                        C0259.m4960(k1VarM6996);
                        return lVarM238;
                    default:
                        C0222.m4282(k1VarM6996);
                        int i10 = 1740;
                        while (true) {
                            i10 ^= 1757;
                            switch (i10) {
                                case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                    i10 = 1771;
                                    break;
                                case 54:
                                    return lVarM238;
                            }
                        }
                        break;
                }
                break;
            default:
                switch (iM2607) {
                    case 0:
                        C0259.m4960(k1VarM6996);
                        return lVarM238;
                    default:
                        C0222.m4282(k1VarM6996);
                        int i11 = 1616;
                        while (true) {
                            i11 ^= 1633;
                            switch (i11) {
                                case Code.UNAVAILABLE /* 14 */:
                                    return lVarM238;
                                case 49:
                                    i11 = 1647;
                                    break;
                            }
                        }
                        break;
                }
                break;
        }
    }
}
