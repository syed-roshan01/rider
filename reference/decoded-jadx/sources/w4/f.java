package w4;

import d7.t;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9.e f16166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m9.k f16167b;

    public f(ba.i iVar, m9.l lVar) {
        this.f16166a = iVar;
        this.f16167b = lVar;
    }

    public final void a(ba.i iVar, IOException iOException) {
        if (iVar.f2805w) {
            return;
        }
        this.f16167b.resumeWith(t.N(iOException));
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        try {
            ((ba.i) this.f16166a).d();
        } catch (Throwable unused) {
        }
        return q8.l.f13235a;
    }
}
