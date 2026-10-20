package f0;

import aa.C0012;
import b7.C0053;
import com.google.firebase.firestore.model.C0160;
import com.google.firebase.installations.ktx.C0175;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.components.C0244;
import k2.C0333;
import s8.C0417;
import w2.C0456;
import w4.C0460;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f5700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(k1 k1Var, int i10) {
        super(1);
        this.f5699a = i10;
        this.f5700b = k1Var;
        int iM6472 = C0333.m6472();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6472 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.valueOf(C0053.m1035("pqmYwrRyreUzm1cMxmKmTBZv1Zjhp")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVarM238 = C0012.m238();
        int iM8207 = C0417.m8207(this);
        k1 k1VarM3072 = C0160.m3072(this);
        switch (iM8207) {
            case 0:
                C0175.m3340(k1VarM3072, C0012.m235((d1.c) obj));
                return lVarM238;
            default:
                o1.u uVar = (o1.u) obj;
                C0460.m8964(k1VarM3072, C0456.m8888(uVar, false));
                C0244.m4695(uVar);
                return lVarM238;
        }
    }
}
