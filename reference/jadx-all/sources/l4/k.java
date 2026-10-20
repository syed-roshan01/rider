package l4;

import ja.e0;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends ja.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f11315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11316c;

    public k(e0 e0Var, h1.b bVar) {
        super(e0Var);
        this.f11315b = bVar;
    }

    @Override // ja.n, ja.e0
    public final void b0(ja.g gVar, long j10) {
        if (this.f11316c) {
            gVar.l(j10);
            return;
        }
        try {
            super.b0(gVar, j10);
        } catch (IOException e4) {
            this.f11316c = true;
            this.f11315b.invoke(e4);
        }
    }

    @Override // ja.n, ja.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e4) {
            this.f11316c = true;
            this.f11315b.invoke(e4);
        }
    }

    @Override // ja.n, ja.e0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e4) {
            this.f11316c = true;
            this.f11315b.invoke(e4);
        }
    }
}
