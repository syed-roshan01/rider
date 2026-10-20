package e8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class v extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f5377b;

    public v(f fVar, f fVar2) {
        y3.e.J(fVar, "creds1");
        this.f5376a = fVar;
        this.f5377b = fVar2;
    }

    @Override // e8.f
    public final void applyRequestMetadata(e eVar, Executor executor, d dVar) {
        this.f5376a.applyRequestMetadata(eVar, executor, new u(this, eVar, executor, dVar, b0.b()));
    }
}
