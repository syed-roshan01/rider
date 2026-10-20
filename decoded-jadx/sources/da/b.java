package da;

import ja.g0;
import ja.i0;
import ja.p;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f4958c;

    public b(h hVar) {
        this.f4958c = hVar;
        this.f4956a = new p(hVar.f4974c.c());
    }

    @Override // ja.g0
    public long I(ja.g gVar, long j10) throws IOException {
        h hVar = this.f4958c;
        d7.a.m(gVar, "sink");
        try {
            return hVar.f4974c.I(gVar, j10);
        } catch (IOException e4) {
            hVar.f4973b.k();
            a();
            throw e4;
        }
    }

    public final void a() {
        h hVar = this.f4958c;
        int i10 = hVar.f4976e;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + hVar.f4976e);
        }
        p pVar = this.f4956a;
        i0 i0Var = pVar.f8561e;
        pVar.f8561e = i0.f8535d;
        i0Var.a();
        i0Var.b();
        hVar.f4976e = 6;
    }

    @Override // ja.g0
    public final i0 c() {
        return this.f4956a;
    }
}
