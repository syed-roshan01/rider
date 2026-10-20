package k0;

import a8.C0009;
import aa.C0012;
import androidx.activity.C0017;
import b1.C0050;
import com.google.android.gms.internal.tasks.C0103;
import com.google.firebase.firestore.remote.C0164;
import com.google.firebase.remoteconfig.C0201;
import com.google.firebase.remoteconfig.internal.Code;
import dagger.hilt.C0256;
import dagger.hilt.android.components.C0229;
import r7.C0404;
import x7.C0473;
import z8.C0493;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f9487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(x2 x2Var, int i10) {
        super(1);
        this.f9486a = i10;
        this.f9487b = x2Var;
        int iM9578 = C0493.m9578();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM9578 <= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.parseInt(C0473.m9195("Sy1Kz1FLjPwZDCQOKqLOd64U43y9P")));
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
        int iM973 = C0050.m973(this);
        x2 x2VarM2027 = C0103.m2027(this);
        switch (iM973) {
            case 0:
                y1.v vVar = (y1.v) obj;
                C0201.m3861();
                y1.u uVarM3144 = C0164.m3144();
                j9.f fVar = C0201.m3861()[3];
                C0256.m4872(uVarM3144, vVar, new y1.e());
                y1.j jVar = (y1.j) vVar;
                C0493.m9574(jVar, C0404.m7920(), new y1.a(null, new s2(x2VarM2027, 0)));
                return C0012.m238();
            default:
                return C0009.m192(C0229.m4399(C0017.m348((z0) obj), x2VarM2027));
        }
    }
}
