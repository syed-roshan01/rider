package g8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(v0 v0Var, u0 u0Var) {
        super(v0Var.f7163c, 0);
        this.f6679c = 2;
        this.f6681e = v0Var;
        this.f6680d = u0Var;
    }

    @Override // g8.q0
    public final void b() {
        List list;
        switch (this.f6679c) {
            case 1:
                Object obj = this.f6681e;
                o8.b.d();
                try {
                    o8.c cVar = ((f0) obj).f6758c.f6771b;
                    o8.b.a();
                    o8.b.b();
                    if (((f0) obj).f6757b == null) {
                        try {
                            ((f0) obj).f6756a.onReady();
                        } catch (Throwable th) {
                            f0 f0Var = (f0) obj;
                            e8.c2 c2VarG = e8.c2.f5217f.f(th).g("Failed to call onReady.");
                            f0Var.f6757b = c2VarG;
                            f0Var.f6758c.f6779j.i(c2VarG);
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
            default:
                u0 u0Var = (u0) this.f6680d;
                u0Var.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (u0Var) {
                        try {
                            if (u0Var.f7150c.isEmpty()) {
                                u0Var.f7150c = null;
                                u0Var.f7149b = true;
                                return;
                            } else {
                                list = u0Var.f7150c;
                                u0Var.f7150c = arrayList;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var) {
        super(f0Var.f6758c.f6775f, 0);
        a4.q qVar = o8.a.f12663b;
        this.f6679c = 1;
        this.f6681e = f0Var;
        this.f6680d = qVar;
    }
}
