package ba;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import x9.b0;
import x9.s;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.f f2785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f2786b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f2787c;

    public f(i iVar, w4.f fVar) {
        this.f2787c = iVar;
        this.f2785a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x9.l lVar;
        String str = "OkHttp " + ((s) this.f2787c.f2791b.f10910b).f();
        i iVar = this.f2787c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            iVar.f2795f.h();
            boolean z10 = false;
            try {
                try {
                    b0 b0VarF = iVar.f();
                    try {
                        w4.f fVar = this.f2785a;
                        fVar.getClass();
                        fVar.f16167b.resumeWith(b0VarF);
                        lVar = iVar.f2790a.f16474a;
                    } catch (IOException e4) {
                        e = e4;
                        z10 = true;
                        if (z10) {
                            fa.m mVar = fa.m.f6417a;
                            fa.m mVar2 = fa.m.f6417a;
                            String str2 = "Callback failure for " + i.a(iVar);
                            mVar2.getClass();
                            fa.m.i(4, str2, e);
                        } else {
                            this.f2785a.a(iVar, e);
                        }
                        lVar = iVar.f2790a.f16474a;
                    } catch (Throwable th) {
                        th = th;
                        z10 = true;
                        iVar.d();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th);
                            d7.a.c(iOException, th);
                            this.f2785a.a(iVar, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    iVar.f2790a.f16474a.b(this);
                    throw th2;
                }
            } catch (IOException e10) {
                e = e10;
            } catch (Throwable th3) {
                th = th3;
            }
            lVar.b(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
