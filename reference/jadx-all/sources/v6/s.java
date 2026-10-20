package v6;

import i7.b1;
import i7.h1;
import i7.i1;
import i7.j1;
import i7.k1;
import i7.l1;
import i7.m1;
import i7.t1;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15936a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static m1 a(i1 i1Var) {
        j1 j1VarA = m1.A();
        int iC = i1Var.C();
        j1VarA.d();
        m1.x((m1) j1VarA.f3641b, iC);
        for (h1 h1Var : i1Var.B()) {
            k1 k1VarC = l1.C();
            String strC = h1Var.B().C();
            k1VarC.d();
            l1.x((l1) k1VarC.f3641b, strC);
            b1 b1VarE = h1Var.E();
            k1VarC.d();
            l1.z((l1) k1VarC.f3641b, b1VarE);
            t1 t1VarD = h1Var.D();
            k1VarC.d();
            l1.y((l1) k1VarC.f3641b, t1VarD);
            int iC2 = h1Var.C();
            k1VarC.d();
            l1.A((l1) k1VarC.f3641b, iC2);
            l1 l1Var = (l1) k1VarC.a();
            j1VarA.d();
            m1.y((m1) j1VarA.f3641b, l1Var);
        }
        return (m1) j1VarA.a();
    }
}
