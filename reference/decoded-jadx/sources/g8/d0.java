package g8;

import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(v0 v0Var, e8.j jVar, e8.c2 c2Var) {
        super(v0Var.f7163c, 0);
        this.f6710c = 3;
        this.f6713f = v0Var;
        this.f6711d = jVar;
        this.f6712e = c2Var;
    }

    @Override // g8.q0
    public final void b() {
        int i10 = this.f6710c;
        Object obj = this.f6713f;
        Object obj2 = this.f6712e;
        Object obj3 = this.f6711d;
        switch (i10) {
            case 0:
                e8.c2 c2VarG = e8.c2.f5223l.g(String.format("Unable to find compressor by name %s", (String) obj2));
                e8.l1 l1Var = new e8.l1();
                ((g0) obj).getClass();
                ((e8.j) obj3).onClose(c2VarG, l1Var);
                return;
            case 1:
                o8.b.d();
                try {
                    o8.c cVar = ((f0) obj).f6758c.f6771b;
                    o8.b.a();
                    o8.b.b();
                    if (((f0) obj).f6757b == null) {
                        try {
                            ((f0) obj).f6756a.onHeaders((e8.l1) obj2);
                        } catch (Throwable th) {
                            f0 f0Var = (f0) obj;
                            e8.c2 c2VarG2 = e8.c2.f5217f.f(th).g("Failed to read headers");
                            f0Var.f6757b = c2VarG2;
                            f0Var.f6758c.f6779j.i(c2VarG2);
                        }
                        break;
                    }
                    o8.b.f12664a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        o8.b.f12664a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 2:
                o8.b.d();
                try {
                    o8.c cVar2 = ((f0) obj).f6758c.f6771b;
                    o8.b.a();
                    o8.b.b();
                    c();
                    o8.b.f12664a.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        o8.b.f12664a.getClass();
                        break;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            case 3:
                ((e8.j) obj3).onClose((e8.c2) obj2, new e8.l1());
                return;
            default:
                ((e8.j) obj3).onClose((e8.c2) obj2, new e8.l1());
                return;
        }
    }

    public final void c() {
        Object obj = this.f6713f;
        f0 f0Var = (f0) obj;
        e8.c2 c2Var = f0Var.f6757b;
        Object obj2 = this.f6712e;
        if (c2Var != null) {
            a6 a6Var = (a6) obj2;
            Logger logger = s1.f7085a;
            while (true) {
                InputStream next = a6Var.next();
                if (next == null) {
                    return;
                } else {
                    s1.b(next);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream next2 = ((a6) obj2).next();
                    if (next2 == null) {
                        return;
                    }
                    try {
                        ((f0) obj).f6756a.onMessage(((f0) obj).f6758c.f6770a.c(next2));
                        next2.close();
                    } catch (Throwable th) {
                        s1.b(next2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    a6 a6Var2 = (a6) obj2;
                    Logger logger2 = s1.f7085a;
                    while (true) {
                        InputStream next3 = a6Var2.next();
                        if (next3 == null) {
                            e8.c2 c2VarG = e8.c2.f5217f.f(th2).g("Failed to read message.");
                            f0Var.f6757b = c2VarG;
                            f0Var.f6758c.f6779j.i(c2VarG);
                            return;
                        }
                        s1.b(next3);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, e8.j jVar, String str) {
        super(g0Var.f6775f, 0);
        this.f6710c = 0;
        this.f6713f = g0Var;
        this.f6711d = jVar;
        this.f6712e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, e8.l1 l1Var) {
        super(f0Var.f6758c.f6775f, 0);
        a4.q qVar = o8.a.f12663b;
        this.f6710c = 1;
        this.f6713f = f0Var;
        this.f6711d = qVar;
        this.f6712e = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, a6 a6Var) {
        super(f0Var.f6758c.f6775f, 0);
        a4.q qVar = o8.a.f12663b;
        this.f6710c = 2;
        this.f6713f = f0Var;
        this.f6711d = qVar;
        this.f6712e = a6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(z2 z2Var, e8.j jVar, e8.c2 c2Var) {
        super(z2Var.f7305e, 0);
        this.f6710c = 4;
        this.f6713f = z2Var;
        this.f6711d = jVar;
        this.f6712e = c2Var;
    }
}
