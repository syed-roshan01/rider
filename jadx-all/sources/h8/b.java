package h8;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8.b f7601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f7602b;

    public b(c cVar, j8.j jVar) {
        this.f7602b = cVar;
        this.f7601a = jVar;
    }

    @Override // j8.b
    public final void D(a4.k kVar) {
        this.f7602b.f7614s++;
        this.f7601a.D(kVar);
    }

    @Override // j8.b
    public final void E() {
        this.f7601a.E();
    }

    @Override // j8.b
    public final void G(boolean z10, int i10, List list) {
        this.f7601a.G(z10, i10, list);
    }

    @Override // j8.b
    public final void N(int i10, long j10) {
        this.f7601a.N(i10, j10);
    }

    @Override // j8.b
    public final int R() {
        return this.f7601a.R();
    }

    @Override // j8.b
    public final void X(int i10, boolean z10, int i11) {
        if (z10) {
            this.f7602b.f7614s++;
        }
        this.f7601a.X(i10, z10, i11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void close() throws IOException {
        this.f7601a.close();
    }

    @Override // j8.b
    public final void d(j8.a aVar, byte[] bArr) {
        this.f7601a.d(aVar, bArr);
    }

    @Override // j8.b
    public final void flush() {
        this.f7601a.flush();
    }

    @Override // j8.b
    public final void o(int i10, j8.a aVar) {
        this.f7602b.f7614s++;
        this.f7601a.o(i10, aVar);
    }

    @Override // j8.b
    public final void r(int i10, int i11, ja.g gVar, boolean z10) {
        this.f7601a.r(i10, i11, gVar, z10);
    }

    @Override // j8.b
    public final void v(a4.k kVar) {
        this.f7601a.v(kVar);
    }
}
