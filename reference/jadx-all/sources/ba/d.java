package ba;

import ea.d0;
import java.io.IOException;
import x9.a0;
import x9.b0;
import x9.c0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9.n f2769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f2770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ca.d f2771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f2774g;

    public d(i iVar, x9.n nVar, e eVar, ca.d dVar) {
        d7.a.m(nVar, "eventListener");
        this.f2768a = iVar;
        this.f2769b = nVar;
        this.f2770c = eVar;
        this.f2771d = dVar;
        this.f2774g = dVar.h();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        x9.n nVar = this.f2769b;
        i iVar = this.f2768a;
        if (z11) {
            if (iOException != null) {
                nVar.getClass();
                d7.a.m(iVar, "call");
            } else {
                nVar.getClass();
                d7.a.m(iVar, "call");
            }
        }
        if (z10) {
            if (iOException != null) {
                nVar.getClass();
                d7.a.m(iVar, "call");
            } else {
                nVar.getClass();
                d7.a.m(iVar, "call");
            }
        }
        return iVar.g(this, z11, z10, iOException);
    }

    public final c0 b(b0 b0Var) throws IOException {
        ca.d dVar = this.f2771d;
        try {
            String strB = b0.b(b0Var, "Content-Type");
            long jA = dVar.a(b0Var);
            return new c0(strB, jA, r9.a.c(new c(this, dVar.b(b0Var), jA)));
        } catch (IOException e4) {
            this.f2769b.getClass();
            d7.a.m(this.f2768a, "call");
            d(e4);
            throw e4;
        }
    }

    public final a0 c(boolean z10) throws IOException {
        try {
            a0 a0VarG = this.f2771d.g(z10);
            if (a0VarG != null) {
                a0VarG.f16342m = this;
            }
            return a0VarG;
        } catch (IOException e4) {
            this.f2769b.getClass();
            d7.a.m(this.f2768a, "call");
            d(e4);
            throw e4;
        }
    }

    public final void d(IOException iOException) {
        this.f2773f = true;
        this.f2770c.c(iOException);
        k kVarH = this.f2771d.h();
        i iVar = this.f2768a;
        synchronized (kVarH) {
            try {
                d7.a.m(iVar, "call");
                if (iOException instanceof d0) {
                    if (((d0) iOException).f5452a == ea.b.REFUSED_STREAM) {
                        int i10 = kVarH.f2821n + 1;
                        kVarH.f2821n = i10;
                        if (i10 > 1) {
                            kVarH.f2817j = true;
                            kVarH.f2819l++;
                        }
                    } else if (((d0) iOException).f5452a != ea.b.CANCEL || !iVar.f2805w) {
                        kVarH.f2817j = true;
                        kVarH.f2819l++;
                    }
                } else if (kVarH.f2814g == null || (iOException instanceof ea.a)) {
                    kVarH.f2817j = true;
                    if (kVarH.f2820m == 0) {
                        k.d(iVar.f2790a, kVarH.f2809b, iOException);
                        kVarH.f2819l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
