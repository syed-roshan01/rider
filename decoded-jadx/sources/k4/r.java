package k4;

import ja.t;
import o7.d0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f9779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja.i f9781c;

    public r(ja.i iVar, d0 d0Var) {
        this.f9779a = d0Var;
        this.f9781c = iVar;
    }

    @Override // k4.o
    public final d0 a() {
        return this.f9779a;
    }

    @Override // k4.o
    public final synchronized ja.i b() {
        ja.i iVar;
        try {
            if (!(!this.f9780b)) {
                throw new IllegalStateException("closed".toString());
            }
            iVar = this.f9781c;
            if (iVar == null) {
                t tVar = ja.m.f8558a;
                d7.a.j(null);
                tVar.l(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return iVar;
    }

    @Override // k4.o, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f9780b = true;
        ja.i iVar = this.f9781c;
        if (iVar != null) {
            w4.e.a(iVar);
        }
    }
}
