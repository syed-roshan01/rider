package i3;

import android.os.Build;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h6.g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f7960u;

    public f(g gVar) {
        this.f7960u = gVar;
    }

    @Override // h6.g
    public final void t0(Throwable th) {
        ((l) this.f7960u.f8599b).e(th);
    }

    @Override // h6.g
    public final void u0(a0 a0Var) {
        g gVar = this.f7960u;
        gVar.f7962d = a0Var;
        a0 a0Var2 = gVar.f7962d;
        Object obj = gVar.f8599b;
        l lVar = (l) obj;
        l2.l lVar2 = lVar.f7976g;
        e eVar = lVar.f7978i;
        ((l) obj).getClass();
        Set<int[]> setA = Build.VERSION.SDK_INT >= 34 ? q.a() : o7.d0.D();
        j0.b0 b0Var = new j0.b0();
        b0Var.f8249b = lVar2;
        b0Var.f8250c = a0Var2;
        b0Var.f8251d = eVar;
        b0Var.f8248a = false;
        b0Var.f8252e = null;
        if (!setA.isEmpty()) {
            for (int[] iArr : setA) {
                String str = new String(iArr, 0, iArr.length);
                b0Var.i(str, 0, str.length(), 1, true, new u(str, 0));
            }
        }
        gVar.f7961c = b0Var;
        ((l) gVar.f8599b).f();
    }
}
