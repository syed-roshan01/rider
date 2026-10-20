package e7;

import i7.u1;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    static {
        new j();
        int i10 = u1.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e4) {
            throw new ExceptionInInitializerError(e4);
        }
    }

    public static void a() {
        v6.q.h(r.f5194c);
        v6.q.h(h.f5166a);
        v6.q.f(new j(), true);
        d7.m mVar = n.f5185a;
        d7.k kVar = d7.k.f4898b;
        kVar.e(n.f5185a);
        kVar.d(n.f5186b);
        kVar.c(n.f5187c);
        kVar.b(n.f5188d);
        d7.j jVar = d7.j.f4896b;
        jVar.b(j.f5169d);
        if (a7.b.f1325b.get()) {
            return;
        }
        v6.q.f(new b(i7.b.class, new w6.f(v6.m.class, 10)), true);
        kVar.e(e.f5162a);
        kVar.d(e.f5163b);
        kVar.c(e.f5164c);
        kVar.b(e.f5165d);
        jVar.b(b.f5153d);
    }
}
