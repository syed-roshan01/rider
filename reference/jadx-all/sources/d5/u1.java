package d5;

import aa.C0012;
import androidx.compose.ui.input.pointer.C0034;
import com.google.firebase.annotations.concurrent.C0125;
import com.google.firebase.firestore.bundle.C0149;
import com.google.firebase.remoteconfig.internal.Code;
import d9.C0225;
import e2.C0261;
import k3.C0335;
import v7.C0450;
import w1.C0456;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f4794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.g1 f4795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(c9.a aVar, m0.g1 g1Var, int i10) {
        super(0);
        this.f4793a = i10;
        this.f4794b = aVar;
        this.f4795c = g1Var;
        int iM667 = C0034.m667();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM667 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0335.m6490("g8FnoJx2G6gLiKemSkF")));
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
        m0.g1 g1VarM2414 = C0125.m2414(this);
        c9.a aVarM2862 = C0149.m2862(this);
        int iM8768 = C0450.m8768(this);
        switch (iM8768) {
            case 0:
                switch (iM8768) {
                    case 0:
                        C0261.m4986(aVarM2862);
                        C0225.m4315(g1VarM2414, C0456.m8876());
                        return lVarM238;
                    default:
                        C0225.m4315(g1VarM2414, C0456.m8876());
                        C0261.m4986(aVarM2862);
                        int i10 = 1740;
                        while (true) {
                            i10 ^= 1757;
                            switch (i10) {
                                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
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
                switch (iM8768) {
                    case 0:
                        C0261.m4986(aVarM2862);
                        C0225.m4315(g1VarM2414, C0456.m8876());
                        return lVarM238;
                    default:
                        C0225.m4315(g1VarM2414, C0456.m8876());
                        C0261.m4986(aVarM2862);
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
