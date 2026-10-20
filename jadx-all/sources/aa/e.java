package aa;

import h6.g;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1349a;

    public e(f fVar) {
        this.f1349a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVarC;
        long jNanoTime;
        while (true) {
            f fVar = this.f1349a;
            synchronized (fVar) {
                aVarC = fVar.c();
            }
            if (aVarC == null) {
                return;
            }
            c cVar = aVarC.f1338c;
            d7.a.j(cVar);
            f fVar2 = this.f1349a;
            boolean zIsLoggable = f.f1350h.v().isLoggable(Level.FINE);
            if (zIsLoggable) {
                cVar.f1342a.f1353a.getClass();
                jNanoTime = System.nanoTime();
                g.a(aVarC, cVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                f.a(fVar2, aVarC);
                if (zIsLoggable) {
                    cVar.f1342a.f1353a.getClass();
                    g.a(aVarC, cVar, "finished run in ".concat(g.X(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    d dVar = fVar2.f1353a;
                    dVar.getClass();
                    dVar.f1348a.execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        cVar.f1342a.f1353a.getClass();
                        g.a(aVarC, cVar, "failed a run in ".concat(g.X(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }
}
