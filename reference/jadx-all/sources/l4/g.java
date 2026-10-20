package l4;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f11295c;

    public g(j jVar, f fVar) {
        this.f11295c = jVar;
        this.f11293a = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11294b) {
            return;
        }
        this.f11294b = true;
        j jVar = this.f11295c;
        synchronized (jVar) {
            f fVar = this.f11293a;
            int i10 = fVar.f11291h - 1;
            fVar.f11291h = i10;
            if (i10 == 0 && fVar.f11289f) {
                l9.d dVar = j.f11298x;
                jVar.P(fVar);
            }
        }
    }
}
