package g8;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e8.c2 f6661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f6662c;

    public /* synthetic */ b2(j2 j2Var, e8.c2 c2Var, int i10) {
        this.f6660a = i10;
        this.f6662c = j2Var;
        this.f6661b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6660a) {
            case 0:
                e8.x xVar = this.f6662c.f6887w.f5403a;
                e8.x xVar2 = e8.x.f5398e;
                if (xVar != xVar2) {
                    j2 j2Var = this.f6662c;
                    j2Var.f6888x = this.f6661b;
                    u3 u3Var = j2Var.f6886v;
                    j2 j2Var2 = this.f6662c;
                    o0 o0Var = j2Var2.f6885u;
                    j2Var2.f6886v = null;
                    j2 j2Var3 = this.f6662c;
                    j2Var3.f6885u = null;
                    j2.g(j2Var3, xVar2);
                    this.f6662c.f6876l.b();
                    if (this.f6662c.f6883s.isEmpty()) {
                        j2 j2Var4 = this.f6662c;
                        j2Var4.getClass();
                        j2Var4.f6875k.execute(new a2(j2Var4, 2));
                    }
                    j2 j2Var5 = this.f6662c;
                    j2Var5.f6875k.d();
                    v6.d dVar = j2Var5.f6880p;
                    if (dVar != null) {
                        dVar.c();
                        j2Var5.f6880p = null;
                        j2Var5.f6878n = null;
                    }
                    v6.d dVar2 = this.f6662c.f6881q;
                    if (dVar2 != null) {
                        dVar2.c();
                        this.f6662c.f6882r.f(this.f6661b);
                        j2 j2Var6 = this.f6662c;
                        j2Var6.f6881q = null;
                        j2Var6.f6882r = null;
                    }
                    if (u3Var != null) {
                        u3Var.f(this.f6661b);
                    }
                    if (o0Var != null) {
                        o0Var.f(this.f6661b);
                    }
                    break;
                }
                break;
            default:
                Iterator it = new ArrayList(this.f6662c.f6883s).iterator();
                while (it.hasNext()) {
                    ((u3) it.next()).c(this.f6661b);
                }
                break;
        }
    }
}
