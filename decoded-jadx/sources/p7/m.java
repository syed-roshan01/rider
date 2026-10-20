package p7;

/* JADX INFO: loaded from: classes.dex */
public final class m extends com.google.gson.internal.bind.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f12833a;

    @Override // p7.a0
    public final Object b(v7.a aVar) {
        a0 a0Var = this.f12833a;
        if (a0Var != null) {
            return a0Var.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) {
        a0 a0Var = this.f12833a;
        if (a0Var == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        a0Var.c(bVar, obj);
    }
}
