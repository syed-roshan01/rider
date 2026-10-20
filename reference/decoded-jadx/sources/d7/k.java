package d7;

import i3.a0;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f4898b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f4899a = new AtomicReference(new x(new a0(9)));

    public final v6.b a(s sVar) {
        AtomicReference atomicReference = this.f4899a;
        x xVar = (x) atomicReference.get();
        xVar.getClass();
        k7.a aVar = sVar.f4913b;
        if (!xVar.f4923b.containsKey(new v(s.class, aVar))) {
            try {
                g gVar = new g();
                sVar.f4915d.ordinal();
                return gVar;
            } catch (GeneralSecurityException e4) {
                throw new androidx.fragment.app.a0("Creating a LegacyProtoKey failed", e4);
            }
        }
        x xVar2 = (x) atomicReference.get();
        xVar2.getClass();
        v vVar = new v(s.class, aVar);
        HashMap map = xVar2.f4923b;
        if (map.containsKey(vVar)) {
            return ((b) map.get(vVar)).f4885c.a(sVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + vVar + " available");
    }

    public final synchronized void b(b bVar) {
        a0 a0Var = new a0((x) this.f4899a.get());
        a0Var.d(bVar);
        this.f4899a.set(new x(a0Var));
    }

    public final synchronized void c(d dVar) {
        a0 a0Var = new a0((x) this.f4899a.get());
        a0Var.e(dVar);
        this.f4899a.set(new x(a0Var));
    }

    public final synchronized void d(l lVar) {
        a0 a0Var = new a0((x) this.f4899a.get());
        a0Var.f(lVar);
        this.f4899a.set(new x(a0Var));
    }

    public final synchronized void e(m mVar) {
        a0 a0Var = new a0((x) this.f4899a.get());
        a0Var.g(mVar);
        this.f4899a.set(new x(a0Var));
    }
}
