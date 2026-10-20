package ba;

import java.io.IOException;
import x9.b0;
import x9.t;
import x9.w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2756a = new a();

    @Override // x9.t
    public final b0 a(ca.f fVar) throws IOException {
        i iVar = fVar.f3063a;
        iVar.getClass();
        synchronized (iVar) {
            try {
                if (!iVar.f2804v) {
                    throw new IllegalStateException("released".toString());
                }
                if (!(!iVar.f2803u)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!(!iVar.f2802t)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = iVar.f2798p;
        d7.a.j(eVar);
        w wVar = iVar.f2790a;
        d7.a.m(wVar, "client");
        try {
            d dVar = new d(iVar, iVar.f2794e, eVar, eVar.a(fVar.f3068f, fVar.f3069g, fVar.f3070h, wVar.f16479f, !d7.a.d((String) fVar.f3067e.f10911c, "GET")).j(wVar, fVar));
            iVar.f2801s = dVar;
            iVar.f2806x = dVar;
            synchronized (iVar) {
                iVar.f2802t = true;
                iVar.f2803u = true;
            }
            if (iVar.f2805w) {
                throw new IOException("Canceled");
            }
            return ca.f.a(fVar, 0, dVar, null, 61).b(fVar.f3067e);
        } catch (m e4) {
            eVar.c(e4.f2831b);
            throw e4;
        } catch (IOException e10) {
            eVar.c(e10);
            throw new m(e10);
        }
    }
}
