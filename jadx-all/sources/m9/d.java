package m9;

/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f11918a;

    public d(c[] cVarArr) {
        this.f11918a = cVarArr;
    }

    @Override // m9.j
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (c cVar : this.f11918a) {
            o0 o0Var = cVar.f11911f;
            if (o0Var == null) {
                d7.a.D("handle");
                throw null;
            }
            o0Var.a();
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        b();
        return q8.l.f13235a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f11918a + ']';
    }
}
