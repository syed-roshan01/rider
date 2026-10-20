package ja;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f8543e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f8544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f8545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f8546d;

    static {
        String str = x.f8577b;
        f8543e = fa.l.i("/", false);
    }

    public j0(x xVar, m mVar, LinkedHashMap linkedHashMap) {
        this.f8544b = xVar;
        this.f8545c = mVar;
        this.f8546d = linkedHashMap;
    }

    @Override // ja.m
    public final e0 a(x xVar) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // ja.m
    public final void b(x xVar, x xVar2) throws IOException {
        d7.a.m(xVar, "source");
        d7.a.m(xVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ja.m
    public final void c(x xVar) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // ja.m
    public final void d(x xVar) throws IOException {
        d7.a.m(xVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ja.m
    public final List g(x xVar) throws IOException {
        d7.a.m(xVar, "dir");
        x xVar2 = f8543e;
        xVar2.getClass();
        ka.g gVar = (ka.g) this.f8546d.get(ka.c.b(xVar2, xVar, true));
        if (gVar != null) {
            return r8.p.W0(gVar.f10676h);
        }
        throw new IOException("not a directory: " + xVar);
    }

    @Override // ja.m
    public final l i(x xVar) throws Throwable {
        l lVarJ;
        Throwable th;
        d7.a.m(xVar, "path");
        x xVar2 = f8543e;
        xVar2.getClass();
        ka.g gVar = (ka.g) this.f8546d.get(ka.c.b(xVar2, xVar, true));
        Throwable th2 = null;
        if (gVar == null) {
            return null;
        }
        boolean z10 = gVar.f10670b;
        l lVar = new l(!z10, z10, null, z10 ? null : Long.valueOf(gVar.f10672d), null, gVar.f10674f, null);
        long j10 = gVar.f10675g;
        if (j10 == -1) {
            return lVar;
        }
        s sVarJ = this.f8545c.j(this.f8544b);
        try {
            a0 a0VarC = r9.a.c(sVarJ.e(j10));
            try {
                lVarJ = r9.a.j(a0VarC, lVar);
                d7.a.j(lVarJ);
                try {
                    a0VarC.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    a0VarC.close();
                } catch (Throwable th5) {
                    d7.a.c(th4, th5);
                }
                th = th4;
                lVarJ = null;
            }
            if (th != null) {
                throw th;
            }
            d7.a.j(lVarJ);
            try {
                sVarJ.close();
            } catch (Throwable th6) {
                th2 = th6;
            }
            if (th2 != null) {
                throw th2;
            }
            d7.a.j(lVarJ);
            return lVarJ;
        } catch (Throwable th7) {
            if (sVarJ != null) {
                try {
                    sVarJ.close();
                } catch (Throwable th8) {
                    d7.a.c(th7, th8);
                }
            }
            lVarJ = null;
            th2 = th7;
        }
    }

    @Override // ja.m
    public final s j(x xVar) {
        d7.a.m(xVar, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // ja.m
    public final e0 k(x xVar) throws IOException {
        d7.a.m(xVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ja.m
    public final g0 l(x xVar) throws Throwable {
        Throwable th;
        a0 a0VarC;
        d7.a.m(xVar, "file");
        x xVar2 = f8543e;
        xVar2.getClass();
        ka.g gVar = (ka.g) this.f8546d.get(ka.c.b(xVar2, xVar, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + xVar);
        }
        s sVarJ = this.f8545c.j(this.f8544b);
        try {
            a0VarC = r9.a.c(sVarJ.e(gVar.f10675g));
            try {
                sVarJ.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (sVarJ != null) {
                try {
                    sVarJ.close();
                } catch (Throwable th4) {
                    d7.a.c(th3, th4);
                }
            }
            th = th3;
            a0VarC = null;
        }
        if (th != null) {
            throw th;
        }
        d7.a.j(a0VarC);
        r9.a.j(a0VarC, null);
        int i10 = gVar.f10673e;
        long j10 = gVar.f10672d;
        if (i10 == 0) {
            return new ka.e(a0VarC, j10, true);
        }
        return new ka.e(new r(r9.a.c(new ka.e(a0VarC, gVar.f10671c, true)), new Inflater(true)), j10, false);
    }
}
